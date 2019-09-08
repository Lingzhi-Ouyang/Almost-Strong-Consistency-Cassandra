class WriteReadCluster:
    __slots__ = ['ver', 'max_start', 'min_finish', 'zone_type', 'write', 'reads']

    def __init__(self, version, start, finish, index):
        self.version = version
        self.max_start = long(start)
        self.min_finish = long(finish)
        self.zone_type = 'S'  # meaning Single-operation zone
        self.write = index
        self.reads = []  # Record the index of the write operation

    def size(self):
        return len(self.reads) + 1

    # Display the cluster info
    def display(self):
        print 'Cluster Version:({0.version}), Max_start:{0.max_start}, Min_finish:{0.min_finish}, Zone_type:{0.zone_type}, Read_count:{1}'.format(
            self, len(self.reads))

    def append(self, start, finish, index):
        self.reads.append(index)
        self.max_start = max(self.max_start, long(start))
        self.min_finish = min(self.min_finish, long(finish))
        if self.min_finish <= self.max_start:
            self.zone_type = 'F'  # meaning Forward zone
        else:
            self.zone_type = 'B'  # meaning Backward zone

