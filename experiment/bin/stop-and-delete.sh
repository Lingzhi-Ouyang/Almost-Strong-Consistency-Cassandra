#!/bin/bash

cd `dirname $0`
cd ../cassandra
./stop-and-delete.sh $1
