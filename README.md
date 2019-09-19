# Almost-Strong-Consistency-Cassandra

Studies of Almost Strong Consistency (**ASC**) for quorum-replicated datastores. There are 3 main directories here :

* [*document*](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/tree/master/document) : Overall descriptions of ASC, including theoretial analysis, experimental result analysis, *etc*. 
* [*experiment*](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/tree/master/experiment) : Implementations and experiments of ASC based on [Cassandra](https://cassandra.apache.org) and the [YCSB](https://github.com/brianfrankcooper/YCSB/wiki)  benchmark. To see how we modified Cassandra for the ASC experiments, please refer to [MODIFICATION](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/blob/master/experiment/CASSANDRA/cassandra). 

* [*numerical_results*](https://github.com/Lingzhi-Ouyang/Almost-Strong-Consistency-Cassandra/tree/master/numerical_results) : Results of the probability of atomicity violation in quorum-based algorithms related to ASC. Calculated and displayed by [Mathematica](https://www.wolfram.com).

