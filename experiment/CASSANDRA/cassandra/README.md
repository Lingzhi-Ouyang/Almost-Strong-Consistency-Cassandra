# Modification in Cassandra

We implement knobs which enable users to turn on/off some optimizations (that was fixed in the official version) in Cassandra. 

Tuning off all the optimizations enables us to validate our theoretical analysis with the experimental evaluation. Turning on one optimization (and turning off other optimizations) each time enables
us to study in depth the effect of this optimization.

Users are allowed to enable / disable *snitch strategy*, *digest messages* and *"forced" read repair* in the experiments. 

To configure these options, please refer to [README.md](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/tree/master/experiment). 



The compiled JAR file lies in the directory *build*, like *apache-cassandra-{3.x}-SNAPSHOT_ASC.jar*, *apache-cassandra-thrift-{3.x}-SNAPSHOT.jar*, etc.



If you want to hack Cassandra in your own way, use [ant](http://ant.apache.org) to compile your project into the JAR file. 

Then, add the JAR file into the classpath by modifying *bin/cassandra.in.sh*.

e.g.

`cassandra_bin="$CASSANDRA_HOME/build/apache-cassandra-3.7-SNAPSHOT_ASC.jar"`

In this way, all the class will be added into the JAVA classpath.



