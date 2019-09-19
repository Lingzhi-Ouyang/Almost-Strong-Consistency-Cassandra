# ASC Experiments 

Implementations, experiments and results of ASC based on modified Cassandra. 

To conduct our experiments, **Openjdk 8 JDK / Oracle Java 8**  and **Python 2.7** are required. [PyPy](http://pypy.org) is optional. 

There are 4 main directories here:

* [*bin*](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/tree/master/experiment/bin) : Main entry of the experiments, including the bash scripts to start / terminate batch experiments automatically. 
* [*CASSANDRA*](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/tree/master/experiment/CASSANDRA) : The source code of modified Cassandra for the ASC experiments, the bash scripts to configure and run Cassandra instances, as well as Cassandra node files (including configuration, data and logs). 
* [*YCSB*](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/tree/master/experiment/YCSB) : The bash scripts of the configuration of YCSB workloads, the generation of traces, the calculation of metrics and the visualization of results. 
* <span id="traces">*traces*</span> : The generated results, calculated metrics and plotted figures. 



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

e.g. to set up a Cassandra cluster named *test* with *3*-DC topology, each data center consisting of 3 instances (i.e. Cassandra nodes), you can input the command below:

```shell
./workload.sh -n test -t 3_3_3
```

In this way, the whole procedures will be executed ***automatically***, including the configurations and the running of both servers (Cassandra instances) and clients (YCSB instances). 

If you want to conduct the experiments ***manually*** in a step-by-step way, Please refer to:  

- [Configure and run Cassandra instances](#cassandra)
- [Configure and run YCSB instances](#ycsb)



### <span id="parameters"> Optional Parameters </span>

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



### <span id="termination">How to Termimate</span>

After the experiments are over, if the Cassandra instances are still running (e.g. when using the option `--keep` or configure and run Cassandra manually), several ways are provided to terminate the Cassandra instances of the {*name*}_*cluster*. 

e.g.

`./stop.sh {name}` : Kill the process of all Cassandra nodes but keep node files in the cluster directory   {*name*}_*cluster*. 

 `./delete.sh {name}` : Delete node files and the cluster directory {*name*}_*cluster*. 

 `./stop-annd-delete.sh {name}` : Kill the process of all Cassandra nodes, then delete node files and the cluster directory {*name*}_*cluster* . 

 `./kill.sh {id1 id2 ...}` : Kill the process of Cassandra nodes *id1*, *id2*, ... whether node files or the cluster directory   {*name*}_*cluster* exist or not. 

 `./killall.sh ` : Kill the process of all Cassandra nodes whether node files or the cluster directory   {*name*}_*cluster* exist or not. 



If you want to terminate the experiments during the experiments, just use `ctrl+c` directly. 

In this way, the process of some Cassandra nodes may keep running, and you need to use  `./kill.sh {id1 id2 ...}`  or `./killall.sh` to kill all node process. 





## <span id="cassandra"> Configure and Run Cassandra Instances </span>

To emulate a distributed datastore in the single-host environment, you need to set up and run multiple Cassandra instances in the following steps. 

`cd CASSANDRA`

### 0. Configuration

First of all, you need to modify the configuration template ***Cassandra/cassandra/conf/cassandra.yaml*** to exactly what you desire (the option *hinted-handoff* can be set later). 



To configure the Cassandra cluster  you can input as below:

`./install-cassandra.sh {name} [-t topology] [-h] [-rt read_timeout] [-wt write_timeout]`

For the detailed meaning of above parameters, please refer to the [Optional Parameters](#parameters).

Attention: you must provide the *name* of the cluster! Other parameters are optional. If omitted, they will be set using the default values.



e.g. To emulate a datastore with 3 data centers, each consisting of 3 instances,

where hinted-handoff in Cassandra is disabled, and timeout for each read / write operation is 500ms / 1000ms respectively:

`./install-cassandra.sh test -t 3_3_3 -rt 500 -wt 1000`

Then, in the directory *CASSANDRA*, a sub-directory named *test_cluster* will be created. All configurations, logs and data of each Cassandra instance will be stored in *test_cluster/node{id}* , where *id*=1/2/…/9. 



### 1. Running

After setting above configurations, start the Cassandra servers. 

`./cassandra.sh {name} {enableSnitch} {enableDigest} {enableRepair} {averageIntraDelay} {IntraJitter} {AverageInterDelay} ​{InterJitter}`

Attention: The sequence of parameters is fixed. All parameters cannnot be omitted. 



The meaning of each parameter:

* **{*name*}** : Select the Cassandra cluster *name_cluster* to run. 
* **{*enableSnitch*}** : Optional : *true* / *false* . ***Default*** : *false*
* **{*enableDigest*}** : Optional : *true* / *false* . ***Default*** : *false*
* **{*enableRepair*}** : Optional : *true* / *false* . ***Default*** : *false*
* **{*AverageIntraDelay*}** **{*IntraJitter*}** : Set intra-datacenter delay in normal distribution N (*AverageIntraDelay*, *IntraJitter* <sup>2</sup>) in milliseconds. Optional : *positive integer . **Default*** : *AverageIntraDelay* = *5* , *IntraJitter* = *1* 
* **{*AverageInterDelay*}** **{*InterJitter*}** : Set inter-datacenter delay in normal distribution N (*AverageInterDelay*, *InterJitter* <sup>2</sup>) in milliseconds. Optional : *positive integer . **Default*** : *AverageInterDelay* = *50* , *InterJitter* = *25* 





### 2. Termination

Please refer to the usage of the commands in [How to Terminate](#termination). These commands also work if the present working directory is *CASSANDRA* .



## <span id="ycsb"> Configure and Run YCSB Instances </span>

To emulate multiple clients issuing concurrent operations in the single-host environment, you need to set up and run multiple YCSB instances in the following steps. 

`cd YCSB/bin`



### 0. Configuration

First of all, you need to modify the configuration file ***conf.py*** to exactly what you desire . 

*conf.py* sets detailed parameters for the generated traces, including:

* **server parameters** : *replica factor*, *write consistency level*, *read consistency level*, … (Note: some parameters' default values can be modified or overrode by commands, including *default_snitch_strategy*, *default_write_process*, *default_read_process*, *default_server_delay_in_ms*, *default_server_delay_jitter_in_ms*, *default_intra_delay_in_ms*, *default_intra_delay_jitter_in_ms* )
* **client parameters** : client number, read proportion, operation number, operation speed, … 
* **algorithm parameters** : write round-trip, read round-trip, ...
* **experiment parameters **: execution time, repeat times, ...



*conf.py* is required to be set correctly, or it will impact the results of trace generation, metrics calculation as well as result visualization. 

Users need to designate:

* one / several *optional* values for each parameter. 
* one *default* value for each parameter. The default value is recommended to be one of the optional values for that parameter. 
* which are tunable / testing parameters. 

***Attention: all parameters are supposed to be set in conf.py before YCSB trace generation!!!*** 



### 1. Trace Generation

After the conf.py is set, traces can be generated:

`python get_ycsb_traces.py {dirname}` 

A directory *dir_name* will be created under the parent directory [*traces*](#traces). Under the directory *dir_name*, each trace will be stored in an independent folder named by its environment parameters. 



### 2. Metrics Calculation

Note that all operations in the experiments are applied to the same register. 

We focus on two main metrics:

* Consistency/ *k*-atomicity : *k*<sub>max</sub> , P(*k*=1,2,3,…). Usually, the results of *k > 10* cannot be solved in limited time, so we only focus on the part *k < 10* .
* Latency : read latency / write latency 

To calculate the above metrics: 

`python atomicity_latency_calculation.py {dirname}  `  or

`pypy atomicity_latency_calculation.py {dirname}  `  for faster speed. 

All the statistics will be stored in a text file name *{dirname}.txt* under the directory *dir_name* .



### 3. Result Visualization

To transfer the above statistics into figures:

`python result_display.py {dirname}`

***Attention: Ensure the parameter names in display_name_list in conf.py are what you want to plot figures before the visualization. Only those tunable paramters with multiple optional values will be plot into figures.*** 



Or, you can use the command below:

`./auto_exec.sh {dirname}`

This is equal to: 

```bash
python get_ycsb_traces.py {dirname} 
pypy atomicity_latency_calculation.py {dirname}
python result_display.py {dirname}
```



