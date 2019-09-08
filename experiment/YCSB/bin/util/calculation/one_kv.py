def one_kv_violation_fz(fz1, fz2):
    if fz1.max_start < fz2.min_finish or fz2.max_start < fz1.min_finish:
        return False
    else:
        return True


def one_kv_violation_fz_bz(fz, bz):
    if fz.min_finish < bz.max_start and fz.max_start > bz.min_finish:
        return True
    else:
        return False


def one_kv(cluster_dict, forward_zones, backward_zones, singles):
    is_one_atomicity = True
    ff_violations = 0
    fb_violations = 0
    fs_violations = 0
    # comparing two forward zones:
    for i in range(len(forward_zones) - 1):
        for j in range(i + 1, len(forward_zones)):
            if one_kv_violation_fz(cluster_dict[forward_zones[i]], cluster_dict[forward_zones[j]]):
                is_one_atomicity = False
                ff_violations += 1
    # comparing a forward zone and a backward zone:
    for i in forward_zones:
        for j in backward_zones:
            if one_kv_violation_fz_bz(cluster_dict[i], cluster_dict[j]):
                is_one_atomicity = False
                fb_violations += 1
    for i in forward_zones:
        for j in singles:
            if one_kv_violation_fz_bz(cluster_dict[i], cluster_dict[j]):
                is_one_atomicity = False
                fs_violations += 1

    return [is_one_atomicity, ff_violations, fb_violations, fs_violations]
