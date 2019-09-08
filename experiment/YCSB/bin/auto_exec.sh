#!/bin/bash

# $1 : additional info.

current_time=$(date "+%Y-%m-%d-%H-%M-%S")

if [ $# -ge 1 ]; then
    traces_dir=$current_time'@'$1
else
    traces_dir=$current_time
fi

echo 'Directory Name: '$traces_dir

echo 'Begin Running: get_ycsb_traces.py'
python get_ycsb_traces.py $traces_dir

echo 'Begin Running: atomicity_latency_calculation.py'
pypy atomicity_latency_calculation.py $traces_dir

echo 'Begin Running: result_display.py'
python result_display.py $traces_dir
