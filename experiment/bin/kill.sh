#!/bin/bash

ports=(7271 7272 7273 7274 7275 7276 7277 7278 7279 7280)

for port in ${ports[@]}; do
    pid=$(netstat -nlp | grep :$port | awk '{print $7}' | awk -F"/" '{print $1}');
    if [[ -n "$pid" ]]; then
        kill -9 $pid
    fi
done

