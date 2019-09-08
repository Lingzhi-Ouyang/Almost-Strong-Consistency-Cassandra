#!/usr/bin/python
# -*- coding: UTF-8 -*-

import os
import sys
from itertools import product
from conf import *
from copy import deepcopy
from util.display import plot


write_round_list = []
read_round_list = []
snitch_list = []
read_process_list = []
property_list = []

write_latency_list = []
read_latency_list = []
k_max_list = []
probability_list = []

outer_path = os.path.abspath(os.path.join(os.getcwd(), "../..")) + '/traces'
directory_name = sys.argv[1]
os.chdir(outer_path)
with open(outer_path + "/" + directory_name + '/' + directory_name + '.txt', 'r') as f:
    lines = f.readlines()
    count = 0
    for line in lines:
        try:
            count +=1
            if not len(line.strip()):
                continue
            raw_values = line.split('#')

            # index map
            # 0: repeat
            # 1-2: write_round read_round
            # 3-4: snitch read_process
            # 5-9: write_quorum read_quorum lb local_repair global_repair
            # 10-13: insert_count operation_count duration client_delay
            # 14-19: replica_factor dc_delay dc_jitter client_count read_proportion ops
            # 20-24: actual_ops actual_operation_num actual_read_proportion write_num read_num
            # 25-27: zone_count(forward/backward/single)
            # 29-30: violation(F-F/F-B/F-S)
            # 31: total zone_pair_violation_rate
            # 32-33: latency(W & R)
            # 34-35: k_max
            # 36: Count-P

            write_round_list.append(raw_values[1])
            read_round_list.append(raw_values[2])
            snitch_list.append(raw_values[3])
            read_process_list.append(raw_values[4])
            props = raw_values[5:20]
            property_list.append(dict(zip(property_name_list, props)))

            write_latency_list.append(eval(raw_values[-4]))
            read_latency_list.append(eval(raw_values[-3]))
            k_max_list.append(eval(raw_values[-2]))
            probability_list.append(eval(raw_values[-1]))
        except:
            print ('Exception in trace line:{}'.format(count))


property_result_list = zip(write_round_list, read_round_list, snitch_list, read_process_list, property_list, write_latency_list, read_latency_list,
                           k_max_list, probability_list)



# The method filters results for a given parameter as the independent variable.
# -name: the parameter name
# -values: all possible values of the parameters, set in "conf.py"
def get_param_results(name, values):
    param_traces = []
    # Add basic-parameter traces.
    param_property_value_map = deepcopy(default_property_value_map)
    # print param_property_value_map

    if name == "server_delay_in_ms":
        for value in values:
            param_property_value_map["server_delay_in_ms"] = value
            param_property_value_map["server_delay_jitter_in_ms"] = str(int(value) / 2)
            # print param_property_value_map
            param_traces.extend(filter(lambda x: cmp(x[4], param_property_value_map) == 0, property_result_list))
            print("value:{}, total num:{}".format(value, len(param_traces)))
            # print("filter:{}".format(filter(lambda x: cmp(x[4], param_property_value_map) == 0, property_result_list)))
        return param_traces

    # Add all relative traces:
    for value in values:
        param_property_value_map[name] = value
        param_traces.extend(filter(lambda x: cmp(x[4], param_property_value_map) == 0, property_result_list))
        print("value:{}, total num:{}".format(value, len(param_traces)))
    return param_traces


if __name__ == '__main__':
    # Make the table of statistics under the default setting.
    default_traces = filter(lambda x: cmp(x[4], default_property_value_map) == 0, property_result_list)
    print len(default_traces)
    try:
        os.makedirs(outer_path + "/" + directory_name  + '/graph')
    except OSError as e:
        pass
    try:
        plot.make_table(default_traces)
    except ValueError as e:
        pass



    # Make plots by tuning parameters.
    for param_name, param_values in parameter_values_map.items():
        print ('\n-----Processing {}:{}-----'.format(param_name, param_values))
        param_results = get_param_results(param_name, param_values)
        if len(param_results) < len(param_values):
            continue

        try:
            os.makedirs(outer_path + "/" + directory_name  + '/graph')
        except OSError as e:
            pass
        try:
            plot.make_plot(param_results, param_name, param_values, display_map[param_name])
        except ValueError as e:
            pass
