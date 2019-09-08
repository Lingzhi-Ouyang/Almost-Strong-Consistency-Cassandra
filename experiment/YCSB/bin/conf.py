#!/usr/bin/python
# -*- coding: UTF-8 -*-

# conf.py sets all properties/parameters for the ASC experiments.

# The parameters consist of server(Cassandra) parameters, client(YCSB) parameters and algorithm parameters.
# Attention!!!
# Each parameter list better has its values in a partial order
# So that the experimental results can be plotted in a reasonable way.


# --> Set server parameters:
# Attention:
# These parameters are for Cassandra.

# Set replica factor.
replica_factor_list = ['3', '1_1_1', '3_1_1', '3_3_3']
default_replica_factor = '1_1_1'

# Set write consistency level.
write_consistency_level_list = ['QUORUM']
default_write_consistency_level = 'QUORUM'

# Set read consistency level.
read_consistency_level_list = ['QUORUM', 'EACH_QUORUM']
default_read_consistency_level = 'QUORUM'

# Set local read repair chance.
dc_local_read_repair_chance_list = ['0.0', '0.2', '0.3', '0.4']
default_dc_local_read_repair_chance = '0.0'

# Set global read repair chance.
read_repair_chance_list = ['0.0', '0.1', '0.2', '0.3']
default_read_repair_chance = '0.0'

# Set load balancing policy.
load_balancing_policy_list = ['rr', 'globalaware', 'localaware']
default_load_balancing_policy = 'rr'

lb_dict = {0: " -db CLTradeoffCassandraDB", 1: " -db CLTradeoffCassandraDB", 2: " -db CLTradeoffCassandraDB"}

# Whether using snitch strategy or not.
snitch_strategy_list = ['None', 'SmartRouting']
default_snitch_strategy = 'None'

# Set replica synchronization in write requests: hinted handoff
write_process_list = ['NoHint', 'Hint']
default_write_process = 'NoHint'

# Set replica synchronization in read/write requests:
# 'FF': No Digest + No Repair
# 'FT': No Digest + repair
# 'TF': Digest + No Repair
# 'TT': Digest + Repair
# 'H': Hinted-handoff enabled
read_process_list = ['FF', 'FT', 'TF', 'TT', 'H']
default_read_process = 'FF'

# Set one-way average inter-DC delay in normal distribution.
server_delay_in_ms_list = ['10', '20', '30', '40', '50']
# server_delay_in_ms_list = ['20', '30']
default_server_delay_in_ms = '50'

# Set one-way inter-DC delay jitter in normal distribution.
server_delay_jitter_in_ms_list = ['5', '10', '15', '20', '25']
default_server_delay_jitter_in_ms = '25'

# Set one-way average intra-DC delay in normal distribution.
intra_delay_in_ms_list = ['5']
default_intra_delay_in_ms = '5'

# Set one-way intra-DC delay jitter in normal distribution.
intra_delay_jitter_in_ms_list = ['1']
default_intra_delay_jitter_in_ms = '1'



# --> Set client parameters:

# Set the number of insert operation in the YCSB load phase.
# Used to set YCSB's property: recordcount
insert_num_list = ['1', '10', '100']
default_insert_num = '1'

# Set operation numbers for each client in the YCSB run phase.
# Used to set YCSB's property: operationcount
# Won't be achieved if the actual speed is limited by the operation_speed and the execution time.
operation_num_list = ['3000']
default_operation_num = '3000'

# The number of write/read clients.
client_num_list = ['10', '20', '30', '40']
default_client_num = '30'

# Set operation speed : each client's operation numbers per second.
operation_speed_list = ['5']
default_operation_speed = '5'

# Set excution time/s.
# Used to set YCSB's property: maxexecutiontime
execution_second_list = ['60', '300', '600']
default_execution_second = '1200'

# Set the proportion of read/update operations in the YCSB run phase.
# Used to set YCSB's property: readproportion & updateproportion
read_proportion_list = ['0.50', '0.60', '0.70', '0.80', '0.90', '0.99']
default_read_proportion = '0.90'

# Set one-way average delay between client & servers.
client_delay_in_ms_list = ['5']
default_client_delay_in_ms = '5'

# --> Set algorithm parameters.
read_round_list = ['2', '1']
write_round_list = ['2', '1']

# --> Set repeat times.
repeat = 10

# Record all parameters in a given order.
# Result process will use the following two lists.
# Also, trace file is named in the form of the following property orders.
algorithm_name_list = ['write_round', 'read_round']
cassandra_name_list = ['snitch_strategy', 'read_process']

property_name_list = ['write_consistency_level', 'read_consistency_level', 'load_balancing_policy',
                      'local_read_repair_chance', 'global_read_repair_chance',
                      'insert_num', 'operation_num',
                      'execution_second', 'client_delay_in_ms',
                      'replica_factor', 'server_delay_in_ms', 'server_delay_jitter_in_ms',
                      'client_num', 'read_proportion', 'operation_speed'
                      ]
property_values_list = [write_consistency_level_list, read_consistency_level_list, load_balancing_policy_list,
                        dc_local_read_repair_chance_list, read_repair_chance_list,
                        insert_num_list, operation_num_list,
                        execution_second_list, client_delay_in_ms_list,
                        replica_factor_list, server_delay_in_ms_list, server_delay_jitter_in_ms_list,
                        client_num_list, read_proportion_list, operation_speed_list
                        ]
property_map = dict(zip(property_name_list, property_values_list))

# Set default parameter values.
default_value_list = [default_write_consistency_level, default_read_consistency_level, default_load_balancing_policy,
                      default_dc_local_read_repair_chance, default_read_repair_chance,
                      default_insert_num, default_operation_num,
                      default_execution_second,  default_client_delay_in_ms,
                      default_replica_factor, default_server_delay_in_ms, default_server_delay_jitter_in_ms,
                      default_client_num, default_read_proportion, default_operation_speed
                      ]
default_property_value_map = dict(zip(property_name_list, default_value_list))


# You can set tunable parameters here.
parameter_name_list = ["client_num", "read_proportion", "replica_factor", "read_consistency_level"]

parameter_values_map = dict((name, property_map[name]) for name in parameter_name_list)

# For result display:
display_name_list =  ['Write consistency level', 'Read consistency level', 'Load-balancing policy',
                      'Local read repair chance', 'Global read repair chance',
                      'Insert number', 'Operation number',
                      'Execution time/s', 'Client-Server delay/ms',
                      'Replica factor', "Inter-DC delay/ms", "Inter-DC delay jitter/ms",
                      'Client number', 'Read proportion', 'Operation number/s'
                      ]
display_map = dict(zip(property_name_list, display_name_list))

if __name__ == '__main__':
    print ('Default parameter-values:{}'.format(default_property_value_map))
    print ("All tunable parameters:{}".format(parameter_values_map))
