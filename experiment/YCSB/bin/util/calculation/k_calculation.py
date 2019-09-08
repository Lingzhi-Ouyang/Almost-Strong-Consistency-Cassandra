from copy import deepcopy
from collections import Counter
from itertools import permutations


# Given an order of writes, decide whether the write order is legal.
def satisfy_time_order(order, start_times, finish_times):
	num = len(order)
	for i in range(num-1):
		for j in range(i+1, num):
			if finish_times[order[j]] <= start_times[order[i]]:	
				return False
	return True


# Given 2 operations, decide whether op1 happens before op2.
def happen_before(op1_finish_time, op2_start_time):
	if op1_finish_time <= op2_start_time:
		return True
	return False


# Raise when discover the current order is illegal.
class IllegalOrderFound(Exception):
	pass


'''
	Given a list of chunks, the method k_calculation() calculates the value of k for each chunk and its corresponding write order.
	Parameters:
	-chunk_dict := {first_beginning_zone_ver in the chunk : list(vers of clusters in the chunk)}
	-cluster_dict := { (ver,pid) : WriteReadCluster }
	-write_start := list(write_start_times)
	-write_finish := list(write_finish_times)
	-read_start := list(read_start_times)
	-read_finish := list(read_finish_times)
	Return val:
	-chunk_k_order_list := list(tuple(k_of_the_chunk,write_order_in_the_chunk))
'''


def k_calculation(chunk_dict, cluster_dict, max_chunk_size, write_start, write_finish, read_start, read_finish):

	# chunk_k_order_list :=[tuple(k_for the chunk, write_order_for _the chunk)]
	chunk_k_order_list = []

	# Record the read num in the perspective of k-atomicity. (That is, the read num reading the latest k writes.)
	# read_count_list[k-1] := num(read k-atomicity)
	# e.g. read_count_list[0] = 100 : Meaning 100 reads return the newest value (staleness = 0).
	# e.g. read_count_list[2] = 30 : Meaning 30 reads return the 3rd recently preceding written value (staleness = 2).
	# 		(That is, satisfying 3-atomicity but unsatisfying 2-atomicity).
	read_count_list = [0] * max_chunk_size

	# When need to display readnum:
	#readnum=[]

	# Process chunk by chunk.
	for vers in chunk_dict.values():
		num = len(vers)
		# Definitely k = 1:
		if num == 1:
			read_count_list[0] += len(cluster_dict[vers[0]].reads)
			
			#readnum.append(len(cluster_dict[vers[0]].reads))
			#print 'read_count_list in this chunk:{}'.format(readnum[-1])

			continue

		if num > 10:
			# Probably will be out-of-memory.
			chunk_k_order_list.append((num, []))
			continue


		## Display chunk info.
		#print '\nvers:{}'.format(vers)
		#for ver in vers:
		#	cluster_dict[ver].display()
		#	write_index = cluster_dict[ver].write
		#	print 'WRITE : time interval:{0}~{1}'.format(write_start[write_index], write_finish[write_index])
		#	for index in cluster_dict[ver].reads:
		#		print 'READ : time interval:{0}~{1}'.format(read_start[index],read_finish[index])

		# Possibly k > 1:
		write_indexes = []  # write_indexes := [write_index] ,used for constructing write_order permutation.
		write_dict = {}  # write_dict := {write_index : ver}
		read_index_ver = []  # read_index_ver := [tuple(read_index, ver)]
		for ver in vers:
			write_indexes.append(cluster_dict[ver].write)
			write_dict[cluster_dict[ver].write] = ver

			#readnum.append(len(cluster_dict[ver].reads))
			#print 'read_count_list in this chunk:{}'.format(readnum[-1])

			for idx in cluster_dict[ver].reads:
				read_index_ver.append((idx, ver))
		
		#print '\nwrite_dict:{}'.format(write_dict)
		#print "read dict:{}".format(read_index_ver)

		#print 'read_index_ver size:{}'.format(len(read_index_ver))
		#if len(read_index_ver) > 90:
		#	continue

		# Get all permutations of writes.
		global write_orders
		# write_orders = []
		# all_permutations(write_indexes, 0, len(write_indexes))
		write_orders = list(permutations(write_indexes, len(write_indexes)))
                #print 'write_orders:{}'.format(write_orders)

		#if [1062, 821, 580] in write_orders:
		#	print '\nvers:{}'.format(vers)
		#	for ver in vers:
		#		cluster_dict[ver].display()
		#		write_index = cluster_dict[ver].write
		#		print 'WRITE : time interval:{0}~{1}'.format(write_start[write_index], write_finish[write_index])
		#		for index in cluster_dict[ver].reads:
		#			print 'READ : time interval:{0}~{1}'.format(read_start[index],read_finish[index])			

		order_kcount_dict = {}  # order_kcount_dict := { tuple(write_order) : tuple(max_k_in_current_order,list(k_count)) }
		for write_order in write_orders:
			# Omit the write permutations that don't satisfy the time order between writes.
			if not satisfy_time_order(write_order, write_start, write_finish):
				continue
			
			# Get reads ordered.
			# Decide each read's suitable position in the current write order.
			# If current write order if found illegal, move to the next write order.
			try:
				# order reads according to start times.
				sorted_read_index_ver = sorted(read_index_ver, key=lambda x: read_start[x[0]])

				# First initialize k = 1
				k_list = [1]*len(sorted_read_index_ver)  # k_list := list(k for each read in the order of sorted_read_index_ver)

				for this, read_info in enumerate(sorted_read_index_ver[:]):
					read_index, read_ver = read_info[0], read_info[1]

					# Satisfy the time order with writes.
					# Attention! Read must be ordered after its dictating write.
					# Find the position of the dictating write of the current read in the current write order.
					dictating_write_pos = write_order.index(cluster_dict[read_ver].write)

					# If the current read happens before a write whose order is before the dictating write,
					# then the write order is illegal.
					for write_pos, write_index in enumerate(write_order[:dictating_write_pos]):
						if happen_before(read_finish[read_index], write_start[write_index]):
							raise IllegalOrderFound

					# First assume that a read should follow immediately after its dictating write. So initialize k = 1
					k_of_current_read = 1
					# Iterate after dictating write's position.
					for idx, write_index in enumerate(write_order[dictating_write_pos + 1:]):
						write_pos = idx + dictating_write_pos + 1
						# When another write happens before the current read.
						if happen_before(write_finish[write_index], read_start[read_index]) and \
							write_pos - dictating_write_pos + 1 > k_of_current_read:
							k_of_current_read = write_pos - dictating_write_pos + 1

					# Satisfy the time order with previous reads.
					# Using Dynamic Programming Strategy.
					# Note: Previous reads have already get their positions in the previous iterations.
					for other, other_read_info in enumerate(sorted_read_index_ver[: this]):
						other_read_index, other_ver = other_read_info[0], other_read_info[1]
						write_pos = write_order.index(cluster_dict[other_ver].write)

						other_read_pos = write_pos + k_list[other] - 1
						# When another read happens before the current read.
						if happen_before(read_finish[other_read_index], read_start[read_index]) and \
							other_read_pos - dictating_write_pos + 1 > k_of_current_read:
							k_of_current_read = other_read_pos - dictating_write_pos + 1

					#k_dict.setdefault(k_of_current_read, []).append(read_index)
					k_list[this] = k_of_current_read

				# Record the value of k under current write order condition.
				#if k_dict:
				#	k_dict = dict((k, -len(indexes)) for k, indexes in k_dict.items())
				#	order_kcount_dict[tuple(write_order)] = max(k_dict), deepcopy(k_dict)

				k_dict = dict(Counter(k_list))
				# use k_count's opposite number for later best-order search:
				k_dict = dict((k, -kcount) for k, kcount in k_dict.items())
				order_kcount_dict[tuple(write_order)] = max(k_dict), deepcopy(k_dict)

			except IllegalOrderFound:
				pass

			# Another way to iterate:
			#read_k = {} # read_k := { read_index : max_k }
			#for ver in vers:
			#	# Record the position of the dictating write of the current read in the current order.
			#	dictating_write_pos = write_order.index(cluster_dict[ver].write) 
			#	for read_index in cluster_dict[ver].reads:
			#		# First assume that a read should follow immediately after its dictating write. So k = 1
			#		read_k[read_index] = 1
			#		# Satisfy the time order with writes.
			#		# Attention! Read must be ordered after its dictating write.
			#		for idx, write_index in enumerate(write_order[dictating_write_pos + 1:]):
			#			if ver == write_dict[write_index]:
			#				continue
			#			write_pos = idx + dictating_write_pos + 1
			#			if happen_before(write_finish[write_index] ,read_start[read_index]) and write_pos - dictating_write_pos + 1 > read_k[read_index]:
			#				read_k[read_index] = write_pos - dictating_write_pos + 1
			#		# Satisfy the time order with reads.
			#		for idx, other_ver in read_index_ver.items():
			#			if ver == write_dict[cluster_dict[other_ver].write]:
			#				continue
			#			write_pos = write_order.index(cluster_dict[other_ver].write)
			#			if happen_before(read_finish[idx],read_start[read_index]) and write_pos - dictating_write_pos + 1 > read_k[read_index]:
			#				read_k[read_index] = write_pos - dictating_write_pos + 1 
			# Record the value of k under current write order condition.
			# order_kcount_dict[tuple(write_order)] = max(read_k.items() , key = lambda x: x[1])[1]
		
		#print 'possible order & k :{}'.format(order_kcount_dict)

		# When any legal write order exists:
		if order_kcount_dict:
			# Select the best order by the following rules:
			# The k value of the chunk is the minimum k_max among all possible write orders.
			# If there exists more than one order with the same minimum k_max, select the one with more k=1/2/3... counts.
			k_info, best_order = min(zip(order_kcount_dict.values(), order_kcount_dict.keys()))
			k_val, k_count_dict = k_info[0], k_info[1]
			chunk_k_order_list.append((k_val, best_order))

			# if k_val > 1:
			# Display chunk info for k > 1.
			# 	print '\nbest order:{}'.format(best_order)
			# 	print 'vers:{}'.format(vers)
			# 	for ver in vers:
			# 		cluster_dict[ver].display()
			# 		write_index = cluster_dict[ver].write
			# 		print 'WRITE :{} time interval:{}~{}'.format(write_index, write_start[write_index], write_finish[write_index])
			# 		for index in cluster_dict[ver].reads:
			# 			print 'READ :{} time interval:{}~{}'.format(index, read_start[index],read_finish[index])


			# Add read numbers corresponding to k-atomicity.
			for k, k_count in k_count_dict.items():
				read_count_list[k-1] -= k_count
		#print "k_count_dict sum:{}".format(sum(k_count_dict.values()))
	#print "readnum using k count:{}".format(sum(readnum))
	return chunk_k_order_list, read_count_list















