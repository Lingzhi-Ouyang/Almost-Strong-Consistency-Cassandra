#!/bin/bash

# process parameters related to replica synchronization / snitch mechanism / message delay
if [[ $# -gt 1 ]]; then
    allowSmartRouting="-DallowSmartRouting=$2"
    allowReadDigest="-DallowReadDigest=$3"
    allowForegroundRepair="-DallowForegroundRepair=$4"
    intraDelayOnAverage="-DintraDelayOnAverage=$5"
    intraDelayJitter="-DintraDelayJitter=$6"
    interDelayOnAverage="-DinterDelayOnAverage=$7"
    interDelayJitter="-DinterDelayJitter=$8"
fi

file="../ycsb/bin/conf.py"
if [[ $2 == "True" ]]; then
    sed -i -e "s|^default_snitch_strategy =.*|default_snitch_strategy = 'SmartRouting'|g" $file
else
    sed -i -e "s|^default_snitch_strategy =.*|default_snitch_strategy = 'None'|g" $file
fi
echo "Finish setting up snitch info in conf.py!"

hint=$(grep '^default_write_process =' $file | sed 's/^default_write_process = \(\.*\)/\1/g')
if [[ $hint == "'Hint'" ]]; then
    sed -i -e "s|^default_read_process =.*|default_read_process = 'H'|g" $file
    sed -i -e "s|^read_round_list =.*|read_round_list = \['1'\]|g" $file
    echo "Finish setting up hinted-handoff info in conf.py!"
elif [[ $3 == "True" && $4 == "False" ]]; then
    sed -i -e "s|^default_read_process =.*|default_read_process = 'TF'|g" $file
    sed -i -e "s|^read_round_list =.*|read_round_list = \['1'\]|g" $file
elif [[ $3 == "False" && $4 == "True" ]]; then
    sed -i -e "s|^default_read_process =.*|default_read_process = 'FT'|g" $file
    sed -i -e "s|^read_round_list =.*|read_round_list = \['1'\]|g" $file
elif [[ $3 == "True" && $4 == "True" ]]; then
    sed -i -e "s|^default_read_process =.*|default_read_process = 'TT'|g" $file
    sed -i -e "s|^read_round_list =.*|read_round_list = \['1'\]|g" $file
else
    sed -i -e "s|^default_read_process =.*|default_read_process = 'FF'|g" $file
fi
echo "Finish setting up read process info in conf.py!"

sed -i -e "s|^default_server_delay_in_ms =.*|default_server_delay_in_ms = '$7'|g" $file
sed -i -e "s|^default_server_delay_jitter_in_ms =.*|default_server_delay_jitter_in_ms = '$8'|g" $file
echo "Finish setting up delay info in conf.py!"

# sleep 10

# $1 : cluster name
dir=$1"_cluster"
lsdir=`ls $dir`
dirarr=($lsdir)
matcharr=()

echo "${dirarr[@]}"

for subdir in ${dirarr[@]}; do
    echo -e "\n-----Starting up $subdir-----"
    match=`echo "$subdir" | egrep "node(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[1-9])"`
    if [[ $match = "$subdir" ]]; then
        export CASSANDRA_CONF="$dir/$subdir/conf"
        #CLASSPATH=$CASSANDRA_CONF
        #for jar in cassandra/lib/*.jar; do
         #   CLASSPATH=$CLASSPATH:$jar
        #done

        #for jar in /cassandra/build/lib/jars/*.jar; do
         #   CLASSPATH=$CLASSPATH:$jar
        #done
        #CLASSPATH=$CLASSPATH:"cassandra/build/apache-cassandra-3.7-SNAPSHOT.jar"

        #export CLASSPATH
        CASSANDRA_HOME=./cassandra
        # set JVM javaagent opts to avoid warnings/errors
        if [ "$JVM_VENDOR" != "OpenJDK" -o "$JVM_VERSION" \> "1.6.0" ] \
              || [ "$JVM_VERSION" = "1.6.0" -a "$JVM_PATCH_VERSION" -ge 23 ]
        then
            JAVA_AGENT="$JAVA_AGENT -javaagent:$CASSANDRA_HOME/lib/jamm-0.3.0.jar"
        fi
        export CASSANDRA_HOME
        export JAVA_AGENT
        export CASSANDRA_INCLUDE=`pwd`"/cassandra/bin/cassandra.in.sh"

        ./cassandra/bin/cassandra -p "$dir/$subdir/pid" -Dcassandra.logdir="$dir/$subdir/logs" -Dcassandra.storagedir="$dir/$subdir/data" -Dlogback.configurationFile="$dir/$subdir/conf/logback.xml" $allowSmartRouting $allowReadDigest $allowForegroundRepair $intraDelayOnAverage $intraDelayJitter $interDelayOnAverage $interDelayJitter -R
        sleep 120
    fi
done
