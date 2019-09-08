#!/bin/bash

dirname=$1"_cluster"
lsdir=`ls $dirname`
dirarr=($lsdir)
matcharr=()

echo "Stopping nodes: ${dirarr[@]}"

for subdir in ${dirarr[@]}; do
    match=`echo "$subdir" | egrep "node(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[1-9])"`
    if [[ $match = "$subdir" ]]; then
        pid=`cat $dirname/$subdir/pid`
        kill -9 "$pid"
    fi
done

