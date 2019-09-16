# Almost-Strong-Consistency-Cassandra

Implementations, experiments and results of ASC based on modified Cassandra. There are 4 main directories here:

* *bin* : Main entries of the experiments. 
  * *workload_test.sh* : 
  * *delay_test.sh* : 
  * *jitter_test.sh* : 
  * *stop.sh* :
  * *delete.sh* :
  * *stop-and-delete.sh* :
  * *kill.sh* :
* *CASSANDRA* : The bash scripts and server configuration files related to Cassandra. 
  * *cassandra* :
  * *install-cassandra.sh* :
  * *cassandra.sh* :
  * stop.sh :
  * *delete.sh* :
  * *stop-and-delete.sh* :
* *YCSB* : The bash scripts and workload configuration files related to YCSB. 
  * *bin* :
  * *lib* :
  * *workloads* :
* *traces* : Results generated in experiments and displayed in figures. 



## Architecture

The experiments are conducted using a C/S architecture. The figure below shows an example of the experimental architecture by dafault. 

* **Servers: Cassandra instances.** By default, 9 instances of Cassandra are run up to simulate a cloud storage system with up to 3 data centers, each consisting of no more than 3 instances. Each Cassandra instance, also denoted a node, acts as a server replica. 
* **Clients: YCSB instances.** The detailed configurations of the YCSB workloads are set up in *YCSB/bin/conf.py* .

![](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/blob/master/experiment/architecture.png)



## Perform the Experiments

The mainly entries to conducted the experiments is *bin/workload_test.sh* , *bin/delay_test.sh* or *bin/jitter_test.sh* . 

e.g. to run the dafault experiments on Cassandra instances with the 3-DC topology, each consisting of 3 instances (i.e. Cassandra nodes), you can:

```shell
./bin/workload.sh -n test -t 3_3_3
```

In this way, the whole procedures will be executed ***automatically***, including the steps in:

* [Configure and run Cassandra instances](#cassandra)
* [Configure and run YCSB instances](#ycsb)

If you want to conduct the experiments ***manually*** in a step-by-step way, Please refer to above two sections.  



### Optional Parameters{#parameters}

Optional parameters for *bin/workload_test.sh* , *bin/delay_test.sh* and *bin/jitter_test.sh* are listed as follows: 

- **-*n* *name*** : Set *name* for your Cassandra clusters. A sub-directory named *{name}_cluster* will be created in the directory *CASSANDRA*. ***Default*** : *name* = *test* 
- **-*t*  *topology* ** : Set *topology* for your Cassandra clusters. For a single-DC cluster, just designate the number of nodes in the single DC, e.g. `-t 3` . For multiple-DC clusters, designate the number of nodes in dc1, dc2, dc3, …, sequentially, and connect them using `_` . e.g. `-t 3_3_3` .  ***Default*** : *topology* = *3_3_3* 

* **-*s*** : Enable the snitch strategy in Cassandra (the type of snitch strategy is designated by the option *endpoint_snitch* in the configuration template file *Cassandra/cassandra/conf/cassandra.yaml*). If omitted, message will be passed to other replicas randomly. ***Default*** : Omitted
* **-*d*** : Enable sending digest messages during the query in Cassandra. If omitted, only full read messages are allowed during the query. ***Default*** : Omitted
* **-*r***  : Enable read repair during the query in Cassandra. If omitted, read repair is forbidden. ***Default*** : Omitted
* **-*h***  : Enable hinted-handoff in Cassandra. If omitted, hinted-handoff is forbidden. ***Default*** : Omitted
* **-*rt* *timeout*** : Set read *timeout* in milliseconds. ***Default*** : *timeout* = *5000* 
* **-*wt* *timeout*** : Set write *timeout* in milliseconds. ***Default*** : *timeout* = *5000* 
* **-*wt* *timeout*** : Set write *timeout* in milliseconds. ***Default*** : *timeout* = *5000* 
* **-*-interdelay average jitter*** : Set inter-datacenter delay in normal distribution N (*average*, *jitter* <sup>2</sup>) in milliseconds. Only available for *bin/delay_test.sh* and *bin/jitter_text.sh* .  ***Default*** : *average* = *50* ,  *jitter* = *25* 
* **-*-intradelay average jitter*** : Set intra-datacenter delay in normal distribution N (*average*, *jitter* <sup>2</sup>) in milliseconds. Only available for *bin/delay_test.sh* and *bin/jitter_text.sh* .  ***Default*** : *average* = *5* ,  *jitter* = *1* 
* **-*i* *info*** : Set *info* for the output directory. The output directory will be named as `currenttime@info` . ***Default*** : *info* = *workload* 
* **-*-keep***  : Keep the Cassandra instances running when the experiments are over. Only available for *bin/workload_test.sh* . ***Default*** : Omitted



After the experiments are over, if the Cassandra instances are still running (e.g. when using the option `--keep` or configure and run Cassandra manually), several ways are provided to terminate the Cassandra instances of the *name_cluster*. 

e.g.

`./bin/stop.sh {name}` 

 `./bin/delete.sh {name}` 

 `./bin/stop-annd-delete.sh {name}` 

 `./bin/kill.sh {name}`



## Configure and Run Cassandra Instances{#cassandra}

<span id="cassandra"> 123 </span>

To emulate a distributed datastore in the local environment, you need to set up and run multiple Cassandra instances in the following steps. 

`cd Cassandra`

First of all, you need to modify the configuration template ***Cassandra/cassandra/conf/cassandra.yaml*** to exactly what you desire (the option *hinted-handoff* can be set later). 

To configure the Cassandra cluster  you can:

`./install-cassandra.sh {name} [-t topology] [-h] [-rt read_timeout] [-wt write_timeout]`

For the detailed meaning of above parameters, please refer to the [optional parameters](#parameters).

Attention: you must provide the *name* of the cluster! 

e.g. To emulate a datastore with 3 data centers, each consisting of 3 instances,

where hinted-handoff in Cassandra is disabled, and timeout for each read / write operation is 500ms / 1000ms respectively:

`./install-cassandra.sh test -t 3_3_3 -rt 500 -wt 1000`

Then, in the directory *CASSANDRA*, a sub-directory named *test_cluster* will be created. All configurations, logs and data of each Cassandra instance will be stored in *test_cluster/node{id}* , where *id*=1/2/…/9. 



After setting the configurations, 





## Configure and Run YCSB Instances{#ycsb}

