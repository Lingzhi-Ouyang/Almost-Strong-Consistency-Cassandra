#!/bin/bash


for port in "$@"; do
    pid=$(netstat -nlp | grep :$port | awk '{print $7}' | awk -F"/" '{print $1}');
    if [[ -n "$pid" ]]; then
        kill -9 $pid
    fi
done

