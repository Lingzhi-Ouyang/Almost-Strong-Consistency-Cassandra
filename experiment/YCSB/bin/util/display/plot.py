import sys
import numpy as np
from matplotlib import pyplot as plt

alg_map = {'w2r2': ['2', '2', 'None', 'FF'],
           'w2r1': ['2', '1', 'None', 'FF'],
           'hint': ['2', '1', 'None', 'H'],
           'digest': ['2', '1', 'None', 'TF'],
           'rr': ['2', '1', 'None', 'FT'],
           'gossip': ['2', '1', 'SmartRouting', 'FF']}
metrix_list = ['k', 'p1', 'plist', 'write_latency', 'read_latency']

# Normalize any list to a 10-element one.
# lst := a trace atomicity probability in the form of : list(P(k)) where k = 1,2,3...
# Returns a list in the form of : list(P(k)/%) where k = 1,2,3...,10
def norm(lst):
    while len(lst) < 10:
        lst.append(0.0)
    return map(lambda x: x * 100, lst)


# Returns average probability list in the form of : list(P(k)/%) where k = 1,2,3...,10
# candidates := relative raw_results
def get_probability_list(candidates):
    plist = map(lambda lst: lst[8], candidates)  # Get candidates' probability lists in the form of : list(tuple(k,P(k)) where k = 1,2,3...
    plist = map(lambda lst: list(zip(*lst)[1]), plist)  # Alter candidates' probability lists into the form of : list(P(k)) where k = 1,2,3...
    return np.average(map(lambda lst: norm(lst), plist), axis=0)  # Calculate the average of candidates' probability lists into the form of : where k = 1,2,3...10


def make_table(default_traces):

    alg_metrix = locals()

    # find existing algorithm traces:

    for alg, alg_param in alg_map.items():
        candidates = filter(lambda v: v[0] == alg_param[0] and v[1] == alg_param[1]
                            and v[2] == alg_param[2] and v[3] == alg_param[3], default_traces)
        if not candidates:
            alg_map.pop(alg)
            continue

        for metrix in metrix_list:
            if metrix + '_' + alg not in alg_metrix:
                alg_metrix[metrix + '_' + alg] = 0

        ## Filter target results for later processing.
        # 0: write round
        # 1: read round
        # 2: snitch
        # 3: read process
        # 4: property
        # 5: write latency
        # 6: read latency
        # 7: k max
        # 8: probability
        try:
            alg_metrix['write_latency_' + alg] = np.average(map(lambda lst: lst[5], candidates))
            alg_metrix['read_latency_' + alg] = np.average(map(lambda lst: lst[6], candidates))
            alg_metrix['k_' + alg] = max(map(lambda lst: lst[7], candidates))
            alg_metrix['plist_' + alg] = get_probability_list(candidates)
        except ValueError:
            pass

    for alg, alg_param in alg_map.items():
        try:
            print("Algorithm {} in {} traces. Maximum k:{}, "
                  "Read atomicity rate:{}, {}, {}, Read latency ratio to W2R2:{}."
                  .format(alg, len(candidates), alg_metrix['k_' + alg],
                          alg_metrix['plist_' + alg][0],
                          alg_metrix['plist_' + alg][1], alg_metrix['plist_' + alg][2],
                          alg_metrix['read_latency_' + alg] / alg_metrix['read_latency_w2r2']))
        except KeyError:
            print("Algorithm {} in {} traces. Maximum k:{}, "
                "Read atomicity rate:{}, {}, {}, Read latency:{}ms."
                .format(alg, len(candidates), alg_metrix['k_' + alg],
                        alg_metrix['plist_' + alg][0],
                        alg_metrix['plist_' + alg][1], alg_metrix['plist_' + alg][2],
                        alg_metrix['read_latency_' + alg]))

    # with open(sys.argv[1] + '/graph/' + "probability.txt", 'w+') as ftable:
    #     ftable.writelines(str(plist_w2r2))



# The method plots graphs for a given parameter as the independent variable.
# -filtered_results: filtered results for a given parameter.
# -name: the parameter name
# -values: all possible values of the parameters, set in "conf.py"
def make_plot(filtered_results, name, values, display_name):
    # print ('Parameter:{}  Values:{}'.format(name, values))

    alg_metrix = locals()

    # find existing algorithm traces:

    for alg, alg_param in alg_map.items():
        candidates = filter(lambda v: v[0] == alg_param[0] and v[1] == alg_param[1]
                            and v[2] == alg_param[2] and v[3] == alg_param[3], filtered_results)
        if not candidates:
            alg_map.pop(alg)
            continue

        for metrix in metrix_list:
            if metrix + '_' + alg not in alg_metrix:
                alg_metrix[metrix + '_' + alg] = []

        for value in values:
            filtered_candidates = filter(lambda rs: rs[4][name] == value, candidates)
            ## Filter target results for later processing.
            # 0: write round
            # 1: read round
            # 2: snitch
            # 3: read process
            # 4: property
            # 5: write latency
            # 6: read latency
            # 7: k max
            # 8: probability
            try:
                alg_metrix['write_latency_' + alg].append(np.average(map(lambda lst: lst[5], filtered_candidates)))
                alg_metrix['read_latency_' + alg].append(np.average(map(lambda lst: lst[6], filtered_candidates)))
                alg_metrix['k_' + alg].append(max(map(lambda lst: lst[7], filtered_candidates)))
                alg_metrix['plist_' + alg].append(get_probability_list(filtered_candidates))
                alg_metrix['p1_' + alg].append(alg_metrix['plist_' + alg][-1][0])
                print( "Algorithm {} under {} value {} in {} traces. Maximum k:{}, Read atomicity rate:{}"
                      .format(alg,name, value, len(filtered_candidates), alg_metrix['k_' + alg][-1],
                                                                       alg_metrix['p1_' + alg][-1]))
            except ValueError:
                pass

    # begin plotting
    index = np.arange(len(values))
    plot_option = {'w2r2': {'bar_pos': -2, 'color': 'black', 'marker': 'D', 'linestyle':'-', 'label_prefix': 'W2R2'},
                   'w2r1': {'bar_pos': -1, 'color': 'red', 'marker': '*', 'linestyle':'-', 'label_prefix': 'W2R1'},
                   #'hint': {'bar_pos': -0.5, 'color': 'c', 'marker': '^', 'linestyle':'--', 'label_prefix': 'Hints'},
                   'rr': {'bar_pos': 0, 'color': 'orange', 'marker': 'x', 'linestyle': '--',
                          'label_prefix': 'Repair'},
                   'digest': {'bar_pos': 1, 'color': 'blue', 'marker': 's', 'linestyle':'--', 'label_prefix': 'Digest'},
                   'gossip': {'bar_pos': 2, 'color': 'gray', 'marker': 'o', 'linestyle':'--', 'label_prefix': 'Snitch'}}
    plot_order = ['w2r2', 'w2r1', 'hint', 'rr', 'digest', 'gossip']

    ## fig 1 : consistency metrix
    fig_size = (8, 6)
    fig = plt.figure(figsize=fig_size)
    title_size = 16
    label_size = 12
    legend_size = 8
    text_size = 7

    ax1 = fig.add_subplot(111)

    # metrix: k_max
    # type: bar
    bar_width = 0.1

    # ax1.bar(index - 2*bar_width , k_w2r2, width=bar_width, align='center', facecolor='black', alpha=1, label="W2R2-k")
    # ax1.bar(index - bar_width, k_w2r1, width=bar_width, align='center', facecolor='red', alpha=1, label="W2R1-k")
    # ax1.bar(index, k_digest, width=bar_width, align='center', facecolor='blue', alpha=1, label="digest-k")
    # ax1.bar(index + bar_width , k_rr, width=bar_width, align='center', facecolor='orange', alpha=1, label="rr-k")
    for alg in plot_order:
        if alg_map.has_key(alg):
            try:
                ax1.bar(index + plot_option[alg]['bar_pos'] * bar_width, alg_metrix['k_' + alg],
                    width=bar_width, align='center', facecolor=plot_option[alg]['color'], alpha=1, label=plot_option[alg]['label_prefix']+':k-max')
            except ValueError as e:
                print(e)
    #
    # text:
    # for x, text1, text2 in zip(index, k_w2r2, k_w2r1):
    #     ax1.text(x - bar_width / 2, text1 + 0.005, '%d' % text1, ha='center', va='bottom')
    #     ax1.text(x + bar_width / 2, text2 + 0.005, '%d' % text2, ha='center', va='bottom')
    
    # label:
    ax1.set_ylabel(r'$k\_{max}$', size=label_size)
    # if name == "read_consistency_level":
    #     ax1.set_yticks(range(1,26,5))
    #     ax1.set_ylim([0, 30])
    # else:
    ax1.set_yticks([1, 2, 3, 4, 5])
    ax1.set_ylim([0,7])
    # if name == "server_delay_jitter_in_ms":
    #     vals = [ str(int(v) * 2) for v in values]
    #     print (vals)
    #     ax1.set_xticks(index, tuple(vals))
    # else:
    #     ax1.set_xticks(index, tuple(values))
    # ax1.set_xticks(index, tuple(values))
    ax1.set_xlabel(display_name, size=16)
    ax1.legend(loc='upper left',fontsize=legend_size)

    # metrix: P(k=1)
    # type: plot/scatter
    ax2 = ax1.twinx()
    # scatter:
    # if name == "replica_factor" or name == "read_consistency_level":
    #     ax2.scatter(index, p1_w2r2, color='black', marker='o', label="W2R2-P(k=1)")
    #     ax2.scatter(index, p1_w2r1, color='red', marker='^', label="W2R1-P(k=1)")
    #     ax2.scatter(index, p1_digest, color='blue', marker='s', label="digest-P(k=1)")
    #     ax2.scatter(index, p1_rr, color='purple', marker='p', label="rr-P(k=1)")
    #     ax2.scatter(index, p1_gossip, color='green', marker='*', label="gossip-P(k=1)")
    # else:
    #     ax2.plot(index, p1_w2r2, color='black', linewidth=1.0, linestyle='-', label="W2R2-P(k=1)")
    #     ax2.plot(index, p1_w2r1, color='red', linewidth=1.5, linestyle='-', label="W2R1-P(k=1)")
    #     ax2.plot(index, p1_digest, color='blue', linewidth=1.5, linestyle='--', label="digest-P(k=1)")
    #     ax2.plot(index, p1_rr, color='purple', linewidth=1.5, linestyle='--', label="rr-P(k=1)")
    #     ax2.plot(index, p1_gossip, color='green', linewidth=1.5, linestyle='--', label="gossip-P(k=1)")

    # ax2.scatter(index, p1_w2r2, color='black', marker='o', label="W2R2-P(k=1)")
    # ax2.scatter(index, p1_w2r1, color='red', marker='^', label="W2R1-P(k=1)")
    # ax2.scatter(index, p1_digest, color='blue', marker='s', label="digest-P(k=1)")
    # ax2.scatter(index, p1_rr, color='purple', marker='p', label="rr-P(k=1)")
    # ax2.scatter(index, p1_gossip, color='green', marker='*', label="gossip-P(k=1)")

    # plot:
    # ax2.plot(index, p1_w2r2, color='black', marker='D', linewidth=1.0, linestyle='-', label="W2R2-P(k=1)")
    # ax2.plot(index, p1_w2r1, color='red', marker='*', linewidth=1.5, linestyle='-', label="W2R1-P(k=1)")
    # ax2.plot(index, p1_digest, color='blue', marker='s', linewidth=1.5, linestyle='--', label="digest-P(k=1)")
    # ax2.plot(index, p1_rr, color='orange', marker='x', linewidth=1.5, linestyle='--', label="rr-P(k=1)")
    for alg in plot_order:
        if alg_map.has_key(alg):
            try:
                ax2.plot(index, alg_metrix['p1_' + alg], color=plot_option[alg]['color'], marker=plot_option[alg]['marker'],
                    linewidth=1.5, linestyle=plot_option[alg]['linestyle'], alpha=0.75, label=plot_option[alg]['label_prefix'] + ':P(k=1)')
            except ValueError as e:
                print(e)
    #
    # text:
    # for x, p22, p21, pd, prr, pgossip in zip(index, p1_w2r2, p1_w2r1, p1_digest, p1_rr, p1_gossip):
        # ax2.text(x, p22 + 0.008, '%.3f' % p22, color='black', ha='center', va='bottom')
        # ax2.text(x+0.2, p21 , '%.3f' % p21, color='red', ha='center', va='bottom')
        # ax2.text(x, pd - 0.01, '%.3f' % pd, color='blue', ha='center', va='bottom')
        # ax2.text(x, prr, '%.3f' % prr, color='purple', ha='center', va='bottom')
        # ax2.text(x, pgossip - 0.015, '%.3f' % pgossip, color='green', ha='center', va='bottom')
    # for x, p21 in zip(index, p1_w2r1):
    #     ax2.text(x+0.2, p21 , '%f' % p21, color='red', ha='center', va='bottom')
    #     # ax2.text(x, pd - 0.01, '%.3f' % pd, color='blue', ha='center', va='bottom')

        
    # label:
    ax2.set_ylabel('P(k=1)/%', size=label_size)
    if name == "replica_factor":
        ax2.set_yticks([99.60, 99.70, 99.80, 99.90, 100.00])
        ax2.set_ylim([99.30, 100.30])
    else:
        ax2.set_yticks([99.96, 99.97, 99.98, 99.99, 100.00])
        ax2.set_ylim([99.93, 100.03])
    ax2.set_xlabel(display_name, size=16)
    # if name == "server_delay_jitter_in_ms":
    #     vals = [ str(int(v) * 2) for v in values]
    #     print (vals)
    #     ax2.set_xticks(index, tuple(vals))
    # else:
    #     ax2.set_xticks(index, tuple(values))
    # ax2.set_title(display_name + '-atomicity results', size=title_size)
    ax2.legend(loc='upper right',fontsize=legend_size)
    
    # figure parameters
    if name == "server_delay_jitter_in_ms"  or name == "server_delay_in_ms":
        vals = [str(int(v)) for v in values]
        plt.xticks(index, tuple(vals))
    else:
        plt.xticks(index, tuple(values))

    # plt.xticks(index, tuple(values))
    plt.xlabel(display_name, size=16)
    # plt.show()
    fig.savefig(sys.argv[1] + '/graph/' + name + "-atomicity.pdf")


    ## fig 2 : latency metrix
    fig = plt.figure(figsize=fig_size)

    # metrix: write/read latency
    # type: bar
    ax3 = fig.add_subplot(111)

    bar_width = 0.1
    # ax3.bar(index - 2*bar_width, write_latency_w2r2, width=bar_width, align='center',
    #         facecolor='black', alpha=0.5, label="W2R2-writeLatency", tick_label=write_latency_w2r2)
    # ax3.bar(index - 2*bar_width, read_latency_w2r2, width=bar_width, align='center',
    #         facecolor='black', alpha=1, label="W2R2-readLatency", tick_label=read_latency_w2r2)
    #
    # ax3.bar(index - bar_width , write_latency_w2r1, width=bar_width, align='center',
    #         facecolor='red', alpha=0.5, label="W2R1-writeLatency", tick_label=write_latency_w2r1)
    # ax3.bar(index - bar_width  , read_latency_w2r1, width=bar_width, align='center',
    #         facecolor='red', alpha=1, label="W2R1-readLatency", tick_label=read_latency_w2r1)
    #
    # ax3.bar(index, write_latency_digest, width=bar_width, align='center',
    #         facecolor='blue', alpha=0.5, label="digest-writeLatency", tick_label=write_latency_digest)
    # ax3.bar(index, read_latency_digest, width=bar_width, align='center',
    #         facecolor='blue', alpha=1, label="digest-readLatency", tick_label=read_latency_digest)
    # #
    # ax3.bar(index + bar_width , write_latency_rr, width=bar_width, align='center',
    #         facecolor='orange', alpha=0.5, label="rr-writeLatency", tick_label=write_latency_rr)
    # ax3.bar(index + bar_width , read_latency_rr, width=bar_width, align='center',
    #         facecolor='orange', alpha=1, label="rr-readLatency", tick_label=read_latency_rr)

    for alg in plot_order:
        if alg_map.has_key(alg):
            try:
                ax3.bar(index + plot_option[alg]['bar_pos'] * bar_width , alg_metrix['write_latency_' + alg], width=bar_width, align='center',
                    facecolor=plot_option[alg]['color'], alpha=0.5, label=plot_option[alg]['label_prefix'] + ":Write Latency", tick_label=alg_metrix['write_latency_' + alg])
                ax3.bar(index + plot_option[alg]['bar_pos'] * bar_width , alg_metrix['read_latency_' + alg], width=bar_width, align='center',
                    facecolor=plot_option[alg]['color'], alpha=1, label=plot_option[alg]['label_prefix'] + ":Read Latency", tick_label=alg_metrix['read_latency_' + alg])
            except ValueError as e:
                print(e)
    #
    # text:
    # for x, w22, r22, w21, r21, wd, rd, wrr,rrr, wgossip, rgossip in zip(index,  write_latency_w2r2, read_latency_w2r2, write_latency_w2r1, read_latency_w2r1,
    #                                                   write_latency_digest, read_latency_digest, write_latency_rr, read_latency_rr, write_latency_gossip, read_latency_gossip):
    #     ax3.text(x - 2*bar_width, w22 + 0.005, '%.1f' % w22, ha='center', va='bottom',
    #              fontsize=text_size)
    #     ax3.text(x - 2*bar_width, r22 - 10, '%.1f' % r22, color='white', ha='center', va='bottom', fontsize=text_size)
    #     ax3.text(x - bar_width, w21 + 0.005, '%.1f' % w21, ha='center', va='bottom',
    #              fontsize=text_size)
    #     ax3.text(x - bar_width, r21 - 10, '%.1f' % r21, color='white', ha='center', va='bottom',
    #              fontsize=text_size)
    #     ax3.text(x, wd + 0.005, '%.1f' % wd, ha='center', va='bottom',
    #              fontsize=text_size)
    #     ax3.text(x, rd - 10, '%.1f' % rd, color='white', ha='center', va='bottom',
    #              fontsize=text_size)
    #     ax3.text(x + bar_width, wrr + 0.005, '%.1f' % wrr, ha='center', va='bottom',
    #              fontsize=text_size)
    #     ax3.text(x + bar_width, rrr - 10, '%.1f' % rrr, color='white', ha='center', va='bottom',
    #              fontsize=text_size)
    #     ax3.text(x + 2 * bar_width, wgossip + 0.005, '%.1f' % wgossip, ha='center', va='bottom',
    #              fontsize=text_size)
    #     ax3.text(x + 2 * bar_width, rgossip - 10, '%.1f' % rgossip, color='white', ha='center', va='bottom',
    #              fontsize=text_size)
        
    # label :
    ax3.set_ylabel('Latency/ms', size=label_size)
    ax3.set_ylim([0, 500])
    # ax3.set_title(display_name + '-latency results', size=title_size)
    # ax3.set_yticks()
    if name == "server_delay_jitter_in_ms" or name == "server_delay_in_ms":
        vals = [ str(int(v)) for v in values]
        plt.xticks(index, tuple(vals))
    else:
        plt.xticks(index, tuple(values))
    # plt.xticks(index, tuple(values))
    plt.xlabel(display_name, size=16)
    ax3.legend(loc='best', fontsize=legend_size)

    # plt.show()
    fig.savefig(sys.argv[1] + '/graph/' + name + "-latency.pdf")

    # metrix: read latency only
    # type: bar
    fig = plt.figure(figsize=fig_size)
    ax4 = fig.add_subplot(111)

    max_bar = 0
    for alg in plot_order:
        if alg_map.has_key(alg):
            try:
                ax4.bar(index + plot_option[alg]['bar_pos'] * bar_width , alg_metrix['read_latency_' + alg], width=bar_width, align='center',
                    facecolor=plot_option[alg]['color'], alpha=1, label=plot_option[alg]['label_prefix'], tick_label=alg_metrix['read_latency_' + alg])
                max_bar = max(max(alg_metrix['read_latency_' + alg]), max_bar)
            except ValueError as e:
                print(e)

    # label :
    ax4.set_ylabel('Read latency/ms', size=label_size)
    ax4.set_ylim([0, max_bar * 1.3])
    # ax4.set_title(display_name + '-latency results', size=title_size)
    # ax4.set_yticks()
    if name == "server_delay_jitter_in_ms"  or name == "server_delay_in_ms":
        vals = [ str(int(v)) for v in values]
        plt.xticks(index, tuple(vals))
    else:
        plt.xticks(index, tuple(values))
    # plt.xticks(index, tuple(values))
    plt.xlabel(display_name, size=16)
    ax4.legend(loc='best', fontsize=legend_size)
    # plt.show()
    fig.savefig(sys.argv[1] + '/graph/' + name + "-read_latency.pdf")

    # np.savetxt(sys.argv[1] + '/graph/w2r2_prob.txt', plist_w2r2)
    # np.savetxt(sys.argv[1] + '/graph/w2r1_prob.txt', plist_w2r1)
    # np.savetxt(sys.argv[1] + '/graph/digest_prob.txt', plist_digest)
    # np.savetxt(sys.argv[1] + '/graph/rr_prob.txt', plist_rr)
    # np.savetxt(sys.argv[1] + '/graph/gossip_prob.txt', plist_gossip)
    # with open("probability.txt", 'w+') as ftable:
    #
    #     ftable.writelines(str(plist_w2r2))
    #     ftable.writelines(str(plist_w2r1))
    #     ftable.writelines(str(plist_digest))
    #     ftable.writelines(str(plist_rr))
    #     ftable.writelines(str(plist_gossip))


