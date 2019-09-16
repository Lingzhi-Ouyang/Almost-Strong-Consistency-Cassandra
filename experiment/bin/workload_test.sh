#!/bin/bash

cluster="test"
topology=""
snitch="False"
digest="False"
repair="False"
hint=""
read_timeout=""
write_timeout=""
info="@workload"
nodefault=""
keep=""

# base directory
cd `dirname $0`
cd ..

file="ycsb/bin/conf.py"

default_inter_delay=$(grep '^default_server_delay_in_ms =' $file | sed 's/^default_server_delay_in_ms = \(\.*\)/\1/g')
default_inter_delay=$(echo $default_inter_delay | tr -cd "[0-9]")

default_inter_jitter=$(grep '^default_server_delay_jitter_in_ms =' $file | sed 's/^default_server_delay_jitter_in_ms = \(\.*\)/\1/g')
default_inter_jitter=$(echo $default_inter_jitter | tr -cd "[0-9]")

default_intra_delay=$(grep '^default_intra_delay_in_ms =' $file | sed 's/^default_intra_delay_in_ms = \(\.*\)/\1/g')
default_intra_delay=$(echo $default_intra_delay | tr -cd "[0-9]")

default_intra_jitter=$(grep '^default_intra_delay_jitter_in_ms =' $file | sed 's/^default_intra_delay_jitter_in_ms = \(\.*\)/\1/g')
default_intra_jitter=$(echo $default_intra_jitter | tr -cd "[0-9]")

while true; do
    case "$1" in
        -n)
            cluster="$2"
            shift 2
        ;;
        -t)
            topology="$1 $2"
            shift 2
        ;;
        -s)
            snitch="True"
            shift
        ;;
        -d)
            digest="True"
            shift
        ;;
        -r)
            repair="True"
            shift
        ;;
        -h)
            hint="$1"
            shift
        ;;
        -rt)
            read_timeout="$1 $2"
            shift 2
        ;;
        -wt)
            write_timeout="$1 $2"
            shift 2
        ;;
        -i)
            info="@$2"
            shift 2
        ;;
        --interdelay)
            default_inter_delay="$2"
            default_inter_jitter="$3"
            shift 3
        ;;
        --intradelay)
            default_intra_delay="$2"
            default_intra_jitter="$3"
            shift 3
        ;;
        #--nodefault)
        #    nodefault="Attention! Default setting won't be executed."
        #    shift
        #;;
        --keep)
            keep="Attention! Still running Cassandra after the experiments."
            shift
        ;;
        *)
            if [ "x$*" != "x" ] ; then
                echo "Error parsing arguments! Unknown argument \"$*\"" >&2
                exit 1
            fi
            break
        ;;
    esac
done


# Creating directory name
current_time=$(date "+%Y-%m-%d-%H-%M")
traces_dir=$current_time$info
if [[ $snitch == "True" ]]; then
    traces_dir=$traces_dir"@snitch"
fi
if [[ $digest == "True" ]]; then
    traces_dir=$traces_dir"@digest"
fi
if [[ $repair == "True" ]]; then
    traces_dir=$traces_dir"@repair"
fi
if [[ $hint == "-h" ]]; then
    traces_dir=$traces_dir"@hint"
fi



echo "Default Inter-DC Delay in Average: "${default_inter_delay}
echo "Default Inter-DC Delay Jitter: "${default_inter_jitter}
echo "Default Intra-DC Delay in Average: "${default_intra_delay}
echo "Default Intra-DC Delay Jitter: "${default_intra_jitter}


cd cassandra
echo -e "\n--------Setting up Cassandra nodes--------"
./install-cassandra.sh $cluster $topology $hint $read_timeout $write_timeout
sleep 5
echo -e "\n--------Starting up Cassandra nodes--------"
./cassandra.sh $cluster $snitch $digest $repair $default_intra_delay $default_intra_jitter $default_inter_delay $default_inter_jitter
sleep 5
echo -e "\n--------Generating YCSB traces--------"
cd ../ycsb/bin
python get_ycsb_traces.py $traces_dir
sleep 5
cd ../../cassandra
if [[ -z $keep ]]; then
    echo -e "\n--------Stoping and deleting nodes--------"
    ./stop-and-delete.sh $cluster
else
    echo -e "\n$keep"
fi
sleep 5


cd ../ycsb/bin
echo -e "\n--------Calculating metrics--------"
pypy atomicity_latency_calculation.py $traces_dir
sleep 5

echo -e "\n--------Generating graphs--------"
python result_display.py $traces_dir


