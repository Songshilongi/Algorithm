package com.songshilong.greedy;

import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-08  20:37
 * @Description: 53. 最大子数组和
 * @Version: 1.0
 */
public class Solution53 {

    /**
     * 动态规划解法
     */
    public int maxSubArrayDyna (int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        int result = sum[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = Math.max(sum[i - 1] + nums[i], nums[i]);
            if (sum[i] > result) result = sum[i];
        }
        return result;
    }


    /**
     * 贪心算法<br>
     * 贪心的关键点在于当sum为负数的时候，已经是累赘了，后面的数加上这个值肯定会变小，所以不如就sum清零，重新计算和
     */
    public int maxSubArrayGreedy(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
            result = Math.max(result, sum);
            if (sum <= 0) sum = 0;

        }
        return result;
    }


}
