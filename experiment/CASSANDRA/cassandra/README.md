# Modification

For our ASC experiments, we extend Apache-Cassandra-3.7 mainly in the following two aspects: 

* [Knobs of some mechanisms (Snitch, Digest, Repair)](#knobs)
* [Communication Delay](#delay)



The compiled JAR file lies in the directory *build*, named *apache-cassandra-{3.x}-SNAPSHOT_ASC.jar*.

Note: If you want to hack Cassandra in your own way, after you finish your implementation, use [ant](http://ant.apache.org) to compile your project into the JAR file. 

Then, add the JAR file into the classpath by modifying *bin/cassandra.in.sh*.

e.g.

`cassandra_bin="$CASSANDRA_HOME/build/apache-cassandra-3.7-SNAPSHOT_ASC.jar"`

In this way, all the class will be added into the JAVA classpath.



## <span id="knobs">Knobs of some mechanisms (Snitch, Digest, Repair)</span>

We implement knobs which enable users to turn on/off some optimizations (that was fixed in the official version) in Cassandra. 

Tuning off the optimizations enables us to validate our theoretical analysis with the experimental evaluation. Turning on one optimization (and turning off other optimizations) each time enables
us to study in depth the effect of this optimization.

Specifically, users are allowed to enable / disable *snitch strategy*, *digest messages* and *"forced" read repair* in the experiments. 

* **Snitch**. Cassandra uses the snitch mechanism to determine relative host proximity for each node and select a preferred group of replicas to read and write from. If *snitch* is enabled, then requests will be efficiently routed to the "nearer" replicas decided by the snitch strategy; if not, requests will be arbitrarily sent. 
* **Digest**. During a read, Cassandra makes all replicas send digest messages except the nearest one (decided by the snitch mechanism). This is speculative and can often save bandwidth. When the replicas hold different versions of data, all replicas are forced to retransmit the concrete data. If *digest* is disabled, then digest messages is forbidden and only full data requests will be sent to replicas during a read. 
*  **(Forced) read repair**. During a read, besides returning the latest replica to the client, Cassandra may find some servers holding stale replicas. The read repair mechanism makes servers holding stale replicas synchronize their data in the background. If *repair* is disabled, then stale replicas won't be synchronized automatically. 

To see how to configure above mechanisms (*Snitch*, *Digest*, *Repair*), please refer to [README.md](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/tree/master/experiment). 



## <span id="delay">Communication Delay</span>

In our ASC experiments, we aim to emulate a distributed datastore in a single host. In order to simulate the network environments across geo-distributed data centers, we inject extra network delay in the network module of Cassandra. Each time before a message is sent, it will be delayed a random amount of time according to the DC positions between the sender and the receiver. 

The injected message delay follows a normal distribution *N*(*μ*, *σ*<sup>2</sup>). where *μ* and *σ* can be set by users. The intra-DC delay and the inter-DC delay can be set in different values. To see how to configure the *delay* options (*inter/intra-DC delay/jitter*), please refer to [README.md](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/tree/master/experiment). 

