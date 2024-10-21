package com.songshilong.greedy;

import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-21  22:08
 * @Description: 435. 无重叠区间
 * @Version: 1.0
 */
public class Solution435 {


    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) return 0;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        int count = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[i - 1][1]) {
                count++;
            } else {
                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
            }
        }
        return intervals.length - count;
    }

    public static void main(String[] args) {
        int[][] array = new int[12][2];
        array[0] = new int[]{-52,31};
        array[1] = new int[]{-73,-26};
        array[2] = new int[]{82,97};
        array[3] = new int[]{-65,-11};
        array[4] = new int[]{-62,-49};
        array[5] = new int[]{95,99};
        array[6] = new int[]{58,95};
        array[7] = new int[]{-31,49};
        array[8] = new int[]{66,98};
        array[9] = new int[]{-63,2};
        array[10] = new int[]{30,47};
        array[11] = new int[]{-40,-26};
        Solution435 solution435 = new Solution435();
        System.out.println(solution435.eraseOverlapIntervals(array));
    }


}
