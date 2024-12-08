package com.songshilong.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-12-08  19:42
 * @Description: 56. 合并区间
 * @Version: 1.0
 */
public class Solution56 {

    public int[][] merge(int[][] intervals) {
        List<int[]> temp = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[i - 1][1]) {
                intervals[i][0] = Math.min(intervals[i - 1][0], intervals[i][0]);
                intervals[i][1] = Math.max(intervals[i - 1][1], intervals[i][1]);
            } else {
                temp.add(intervals[i - 1]);
            }
        }
        temp.add(intervals[intervals.length - 1]);
        return temp.toArray(new int[temp.size()][]);
    }
}
