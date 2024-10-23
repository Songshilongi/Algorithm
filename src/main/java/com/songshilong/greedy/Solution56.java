package com.songshilong.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-23  21:19
 * @Description: 56. 合并区间
 * @Version: 1.0
 */
public class Solution56 {


    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[i - 1][1]) {
                intervals[i][0] = Math.min(intervals[i][0], intervals[i - 1][0]);
                intervals[i][1] = Math.max(intervals[i][1], intervals[i - 1][1]);
            }else {
                result.add(intervals[i -1]);
            }

        }
        result.add(intervals[intervals.length - 1]);
        return result.toArray(new int[result.size()][]);
    }



}
