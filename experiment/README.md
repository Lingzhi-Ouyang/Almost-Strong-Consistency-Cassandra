# Almost-Strong-Consistency-Cassandra

Implementations, experiments and results of ASC based on modified Cassandra. There are 4 main directories here:

* *bin* : Main entry of the experiments. 
  * *workload_test.sh* : 
  * *delay_test.sh* : 
  * *jitter_test.sh* : 
  * *stop.sh* :
  * *delete.sh* :
  * *stop-and-delete.sh* :
  * *kill.sh* :
* *CASSANDRA* : The source code of modified Cassandra for the ASC experiments, the bash scripts to configure and run Cassandra instances, as well as Cassandra node files (including configuration, data and logs). 
  * *cassandra* :
  * *install-cassandra.sh* :
  * *cassandra.sh* :
  * stop.sh :
  * *delete.sh* :
  * *stop-and-delete.sh* :
* *YCSB* : The bash scripts of the configuration of YCSB workloads, the generation of traces, the calculation of metrics and the visualization of results. 
  * *bin* :
  * *lib* :
  * *workloads* :
* *traces* : Results generated in experiments and displayed in figures. 



## Architecture

The ASC experiments are conducted using a C/S architecture. The figure below shows an example of the experimental architecture by dafault. 

* **Servers: Cassandra instances.** By default, 9 instances of Cassandra are run up to simulate a cloud storage system with up to 3 data centers, each consisting of no more than 3 instances. Each Cassandra instance, also denoted a node, acts as a server replica. 
* **Clients: YCSB instances.** The detailed configurations of the YCSB workloads are set up in *YCSB/bin/conf.py* . 

![](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/blob/master/experiment/architecture.png)



## Perform the Experiments

The main entry to conducted the experiments is in the directory *bin* .

`cd bin`



### Overview

To quickly conduct the experiments by tuning workloads (including client number, read-write ratio, operation speed, replica factor, quorum level, *etc*.) / inter-DC delay / inter-DC delay jitter, use *workload_test.sh* , *delay_test.sh* or *jitter_test.sh* accordingly. 

e.g. to set up a Cassandra cluster named *test* with *3*-DC topology, each data center consisting of 3 instances (i.e. Cassandra nodes), you can use the command below:

```shell
./workload.sh -n test -t 3_3_3
```

In this way, the whole procedures will be executed ***automatically***, including the configurations and the running of both servers (Cassandra instances) and clients (YCSB instances). 

If you want to conduct the experiments ***manually*** in a step-by-step way, Please refer to:  

- [Configure and run Cassandra instances](#cassandra)
- [Configure and run YCSB instances](#ycsb)



### <span id="parameter"> Optional Parameters </span>

Optional parameters for *workload_test.sh* , *delay_test.sh* and *jitter_test.sh* are listed as follows: 

- **-*n* {*name*}** : Set *name* for your Cassandra cluster. A sub-directory named *{name}_cluster* will be created in the directory *CASSANDRA*. ***Default*** : *name* = *test* 
- **-*t*  {*topology*} ** : Set *topology* for your Cassandra cluster. For a single-DC cluster, just designate the number of nodes in the single DC, e.g. `-t 3` . For a multiple-DC cluster, designate the number of nodes in dc1, dc2, dc3, …, sequentially, and connect them using `_` . e.g. `-t 3_3_3` .  ***Default*** : *topology* = *3_3_3* 

* **-*s*** : Enable the snitch strategy in Cassandra (the type of snitch strategy is designated by the option *endpoint_snitch* in the configuration template file *Cassandra/cassandra/conf/cassandra.yaml*). If omitted, message will be passed to other replicas randomly. ***Default*** : Omitted
* **-*d*** : Enable sending digest messages during the query in Cassandra. If omitted, only full read messages are allowed during the query. ***Default*** : Omitted
* **-*r***  : Enable read repair during the query in Cassandra. If omitted, read repair is forbidden. ***Default*** : Omitted
* **-*h***  : Enable hinted-handoff in Cassandra. If omitted, hinted-handoff is forbidden. ***Default*** : Omitted
* **-*rt* {*timeout*}** : Set read *timeout* in milliseconds. ***Default*** : *timeout* = *5000* 
* **-*wt* {*timeout*}** : Set write *timeout* in milliseconds. ***Default*** : *timeout* = *5000* 
* **-*wt* {*timeout*}** : Set write *timeout* in milliseconds. ***Default*** : *timeout* = *5000* 
* **-*-interdelay*** **{*average*}** **{*jitter*}** : Set inter-datacenter delay in normal distribution N (*average*, *jitter* <sup>2</sup>) in milliseconds. Only available for *workload_test.sh* .  ***Default*** : *average* = *50* ,  *jitter* = *25* 
* **-*-intradelay*** **{*average*}** **{*jitter*}** : Set intra-datacenter delay in normal distribution N (*average*, *jitter* <sup>2</sup>) in milliseconds. Only available for *workload_test.sh* .  ***Default*** : *average* = *5* ,  *jitter* = *1* 
* **-*-keep***  : Keep the Cassandra instances running when the experiments are over. Only available for *workload_test.sh* . ***Default*** : Omitted
* **-*-nodefault***  : Omit the experiments under the default settings. Only available for *delay_test.sh* and *jitter_text.sh* . ***Default*** : Omitted
* **-*i* {*info*}** : Set *info* for the output directory. The output directory will be named as `currenttime@info` . ***Default*** : *info* = *workload* 



### <span id="termination"> Termination </span>

After the experiments are over, if the Cassandra instances are still running (e.g. when using the option `--keep` or configure and run Cassandra manually), several ways are provided to terminate the Cassandra instances of the {*name*}_*cluster*. 

e.g.

`./bin/stop.sh {name}` : Kill the process of all Cassandra nodes but keep node files in the cluster directory   {*name*}_*cluster*. 

 `./bin/delete.sh {name}` : Delete node files and the cluster directory {*name*}_*cluster*. 

 `./bin/stop-annd-delete.sh {name}` : Kill the process of all Cassandra nodes, then delete node files and the cluster directory {*name*}_*cluster* . 

 `./bin/kill.sh {id1 id2 ...}` : Kill the process of Cassandra nodes *id1*, *id2*, ... whether node files or the cluster directory   {*name*}_*cluster* exist or not. 

 `./bin/kill.sh ` : Kill the process of all Cassandra nodes whether node files or the cluster directory   {*name*}_*cluster* exist or not. 



## <span id="cassandra"> Configure and Run Cassandra Instances </span>

To emulate a distributed datastore in the single-host environment, you need to set up and run multiple Cassandra instances in the following steps. 

`cd Cassandra`



### 0. Configure

First of all, you need to modify the configuration template ***Cassandra/cassandra/conf/cassandra.yaml*** to exactly what you desire (the option *hinted-handoff* can be set later). 



To configure the Cassandra cluster  you can:

`./install-cassandra.sh {name} [-t topology] [-h] [-rt read_timeout] [-wt write_timeout]`

For the detailed meaning of above parameters, please refer to the [optional parameters](#parameters).

Attention: you must provide the *name* of the cluster! Other parameters are optional. If omitted, they will be set using the default values.



e.g. To emulate a datastore with 3 data centers, each consisting of 3 instances,

where hinted-handoff in Cassandra is disabled, and timeout for each read / write operation is 500ms / 1000ms respectively:

`./install-cassandra.sh test -t 3_3_3 -rt 500 -wt 1000`

Then, in the directory *CASSANDRA*, a sub-directory named *test_cluster* will be created. All configurations, logs and data of each Cassandra instance will be stored in *test_cluster/node{id}* , where *id*=1/2/…/9. 



### 1. Run

After setting above configurations, start the Cassandra servers. 

`./cassandra.sh {name} {enableSnitch} {enableDigest} {enableRepair} {averageIntraDelay} {IntraJitter} {AverageInterDelay} ​{InterJitter}`

Attention: The sequence of parameters is fixed. All parameters cannnot be omitted. 



The meaning of each parameter:

* **{*name*}** : Select the Cassandra cluster *name_cluster* to run. 
* **{*enableSnitch*}** : Optional : *true* / *false* . ***Default*** : *false*
* **{*enableDigest*}** : Optional : *true* / *false* . ***Default*** : *false*
* **{*enableRepair*}** : Optional : *true* / *false* . ***Default*** : *false*
* **{*AverageIntraDelay*}** **{*IntraJitter*}** : Set intra-datacenter delay in normal distribution N (*AverageIntraDelay*, *IntraJitter* <sup>2</sup>) in milliseconds. Optional : *positive integer . ***Default*** : *AverageIntraDelay* = *5* , *IntraJitter* = *1* 
* **{*AverageInterDelay*}** **{*InterJitter*}** : Set inter-datacenter delay in normal distribution N (*AverageInterDelay*, *InterJitter* <sup>2</sup>) in milliseconds. Optional : *positive integer . ***Default*** : *AverageInterDelay* = *50* , *InterJitter* = *25* 



### 2. Terminate

Please refer to the [termination](#termination).



## <span id="ycsb"> Configure and Run YCSB Instances </span>

