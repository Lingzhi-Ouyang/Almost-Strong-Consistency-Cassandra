#!/usr/bin/python
# -*- coding: UTF-8 -*-

# Attention!!!
# Before running this script, ensure that all of the settings listed in conf.py are what you desire. 
# All properties/parameters in this script have been given in the file "conf.py". 
# Including ip list, Cassandra/server parameters and YCSB/client parameters.

from cassandra.cluster import Cluster
from itertools import product
from conf import *
import time
import os
import sys
import subprocess


if __name__ == '__main__':
    # Get connected to the Cassandra clusters.
    with open("../workloads/cassProperties") as f:
        ip_list = f.readline().split("=")[1].split(",")
    cluster = Cluster(ip_list)
    session = cluster.connect()
    # session.default_timeout = 10

    # Set output directory name and filename.
    outer_path = os.path.abspath(os.path.join(os.getcwd(), "../..")) + '/traces'
    os.chdir(outer_path)
    dir_name = sys.argv[1]

    changing_parameter_map = {}
    count = 0
    for run in range(repeat):
        default_setting_done = False
        for param_name, param_values in parameter_values_map.items():
            # Set basic values for all parameters.
            replica_factor = default_replica_factor
            read_consistency_level = default_read_consistency_level
            write_consistency_level = default_write_consistency_level
            dc_local_read_repair_chance = default_dc_local_read_repair_chance
            read_repair_chance = default_read_repair_chance
            load_balancing_policy = default_load_balancing_policy
            snitch_strategy = default_snitch_strategy
            read_process = default_read_process
            server_delay_in_ms = default_server_delay_in_ms
            server_delay_jitter_in_ms = default_server_delay_jitter_in_ms

            insert_num = default_insert_num
            operation_num = default_operation_num
            client_num = default_client_num
            operation_speed = default_operation_speed
            execution_second = default_execution_second
            read_proportion = default_read_proportion
            client_delay_in_ms = default_client_delay_in_ms

            for param_value in param_values:
                # if the setting of all default property value is done, omit it.
                if default_property_value_map[param_name] == param_value:
                    if default_setting_done is True:
                        continue
                    else:
                        default_setting_done = True

                globals()[param_name] = param_value

                # Set replication info.
                replication_info = ""
                dc_replica_num = replica_factor.split('_')
                if len(dc_replica_num) == 1:
                    replication_info += "'class' : 'SimpleStrategy', 'replication_factor' : " + str(dc_replica_num[0])
                if len(dc_replica_num) > 1:
                    replication_info += "'class' : 'NetworkTopologyStrategy', 'dc1' : " + dc_replica_num[0]
                    for index, replica_num in enumerate(dc_replica_num[1:], 2):
                        replication_info += ", 'dc" + str(index) + "' : " + replica_num

                # Set consistency level info.
                if read_consistency_level == "LOCAL_QUORUM":
                    write_consistency_level = "EACH_QUORUM"
                else:
                    write_consistency_level = default_write_consistency_level

                # Set read/write proportion info.
                update_proportion = str(1 - float(read_proportion))

                for write_round, read_round in product(write_round_list, read_round_list):
                    print ('---> Now tuning parameter < {} : {} > to the value < {} >'.format(param_name,
                                                                                              parameter_values_map[
                                                                                                  param_name],
                                                                                              locals()[param_name]))
                    print ('------------Cassandra parameters------------')
                    print ("Replication: " + replication_info)
                    print ("Write/Read Consistency Level: " + write_consistency_level + "/" + read_consistency_level)
                    print ("Background Global/Local Read-Repair Chance:{}, {} "
                           .format(read_repair_chance, dc_local_read_repair_chance))
                    print ("Load Balance Policy: " + load_balancing_policy)
                    print ("Snitch Strategy: " + snitch_strategy)
                    print ("Digest Requests/Replica Synchronization: " + read_process)
                    print ("Server Delay across DCs, average:{}ms,stddev:{}ms"
                           .format(server_delay_in_ms, server_delay_jitter_in_ms))
                    print ('------------Client parame'
                           'print eters---------------')
                    print ("Insert Number:{}, Read+Write Operation Number:{}".format(insert_num, operation_num))
                    print ("Client Number:{}, Read/Update Proportion:{:.2f}/{:.2f},  OPS:{}"
                           .format(client_num, float(read_proportion), float(update_proportion), operation_speed))
                    print("Client Delay:{}ms".format(client_delay_in_ms))
                    print ("Max Execution Time:{}s".format(execution_second))
                    print ('------------Algorithm parameters------------')
                    print ("Write/Read Round: " + write_round + "/" + read_round)
                    count += 1
                    print ('This is Trace : {}'.format(count))
                    print ('')

                    st = time.time()
                    while True:
                        try:
                            print(time.strftime("%Y-%m-%d-%H-%M-%S",
                                                time.localtime(time.time())) + " Start Dropping existed keyspace.")
                            session.execute('drop keyspace if exists ycsb;', None, None)
                            # time.sleep(10)
                            print(time.strftime("%Y-%m-%d-%H-%M-%S",
                                                time.localtime(time.time())) + " Finish Dropping existed keyspace.")

                            session.execute(
                                "create keyspace ycsb with replication = {" + replication_info + "};",
                                None, None)
                            print(time.strftime("%Y-%m-%d-%H-%M-%S",
                                                time.localtime(time.time())) + " Finish creating existed keyspace.")
                            # time.sleep(5)

                            session.execute("use ycsb;", None, None)
                            print(time.strftime("%Y-%m-%d-%H-%M-%S",
                                                time.localtime(time.time())) + " Using ycsb.")

                            session.execute(
                                'create table usertable ( y_id varchar primary key, field0 varchar)' +
                                ' WITH dclocal_read_repair_chance = ' + str(dc_local_read_repair_chance) +
                                ' AND read_repair_chance = ' + str(read_repair_chance) +
                                ' AND caching = {\'keys\': \'NONE\',\'rows_per_partition\': \'NONE\'}' +
                                ' AND speculative_retry = \'NONE\';', None, None)
                            print ("Successfully create table!")
                            break
                        except Exception as e:
                            print e
                            print (time.strftime("%Y-%m-%d-%H-%M-%S",
                                                 time.localtime(time.time())) + " Cannot connect to server")
                    end = time.time()
                    print ('Connection used time: {}'.format(end-st))

                    if load_balancing_policy == 'rr':
                        db = " -db CLTradeoffCassandraDB"
                    elif load_balancing_policy == 'localaware':
                        db = ""
                    else:
                        db = "tbd"

                    # YCSB load phase:
                    # Insert test data into the table.
                    load = subprocess.Popen(
                        args=" ../ycsb/bin/ycsb load cassandra-cql" +
                             " -P ../ycsb/workloads/workloada" +
                             " -P ../ycsb/workloads/cassProperties" +
                             " -p workload=CLTradeoffWorkload" +
                             " -p clientID=0" +
                             " -p readproportion=" + str(read_proportion) +
                             " -p updateproportion=" + str(update_proportion) +
                             " -p insertcount=" + insert_num +
                             " -p operationcount=" + operation_num +
                             " -p cassandra.readconsistencylevel=ALL" +
                             " -p cassandra.writeconsistencylevel=ALL" +
                             " -p lb=" + load_balancing_policy +
                             " -p clientcount=" + str(client_num) + db,
                        shell=True,
                        cwd=".")
                    load.wait()
                    # time.sleep(5)

                    # YCSB run phase:

                    # Set output filename with the following info:
                    # -Repeat sequence number
                    # -Algorithm parameters: write round, read round
                    # -Cassandra parameters: snitch strategy, read process
                    # -YCSB/client workload parameters:
                    #  insert count, client count, operation_speed, max execution time, client delay
                    # -Other Cassandra/server parameters:
                    # replica factor, write consistency level, read consistency level,
                    # read repair chance, load balance Policy...

                    sub_dir = (str(run) +
                               "@W=" + write_round + "@R=" + read_round +
                               "@route=" + snitch_strategy + "@digestRR=" + read_process +
                               "@writeCL=" + write_consistency_level + "@readCL=" + read_consistency_level +
                               "@lb=" + load_balancing_policy +
                               "@localRR=" + str(dc_local_read_repair_chance) +
                               "@globalRR=" + str(read_repair_chance) +
                               "@instNum=" + insert_num +
                               "@opNum=" + operation_num +
                               "@time=" + execution_second +
                               "@csDelay=" + client_delay_in_ms +
                               "@replica=" + replica_factor +
                               "@dcDelay=" + server_delay_in_ms + "@dcJitter=" + server_delay_jitter_in_ms +
                               "@client=" + str(client_num) + "@readProp=" + read_proportion +
                               "@ops=" + operation_speed)
                    try:
                        os.makedirs("./" + dir_name + "/" + sub_dir)
                    except OSError as e:
                        pass

                    result = []

                    for client_id in range(0, int(client_num)):
                        rlb = db
                        if db == 'tbd':
                            rlb = lb_dict[client_id % 3]
                        result.append(subprocess.Popen(
                            args=" ../ycsb/bin/ycsb run cassandra-cql" +
                                 " -P ../ycsb/workloads/workloada" +
                                 " -P ../ycsb/workloads/cassProperties" +
                                 " -p workload=CLTradeoffWorkload" +
                                 " -p writeround=" + write_round + " -p readround=" + read_round +
                                 " -p replica=" + replica_factor +
                                 " -p cassandra.readconsistencylevel=" + read_consistency_level +
                                 " -p cassandra.writeconsistencylevel=" + write_consistency_level +
                                 " -p dcchance=" + str(dc_local_read_repair_chance) +
                                 " -p chance=" + str(read_repair_chance) +
                                 " -p lb=" + load_balancing_policy +
                                 " -p snitch=" + snitch_strategy +
                                 " -p readprocess=" + read_process +
                                 " -p dcdelay=" + server_delay_in_ms + " -p dcjitter=" + server_delay_jitter_in_ms +
                                 " -p insertcount=" + insert_num +
                                 " -p operationcount=" + operation_num +
                                 " -p clientcount=" + str(client_num) +
                                 " -p ops=" + operation_speed + " -p maxexecutiontime=" + execution_second +
                                 " -p readproportion=" + str(read_proportion) +
                                 " -p updateproportion=" + str(update_proportion) +
                                 " -p clientdelay=" + client_delay_in_ms +
                                 " -p repeat=" + str(run) +
                                 " -p clientID=" + str(client_id) +
                                 " -p dir_name=" + dir_name + " -p sub_dir=" + sub_dir +
                                 " -p threadcount=1 " +
                                 " -p recording=true" + rlb,
                            shell=True,
                            cwd="."))

                    while len(result) > 0:
                        i = 0
                        while i < len(result):
                            res = result[i]
                            res.poll()
                            if res.returncode is not None:
                                del result[i]
                                continue
                            i += 1
                        time.sleep(0.5)
                    time.sleep(1)
                    end = time.time()
                    print ('This trace generating used time: {}'.format(end-st))
                    print(time.strftime("%Y-%m-%d-%H-%M-%S", time.localtime(time.time())))
