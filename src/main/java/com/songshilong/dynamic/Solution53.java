package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-24  18:57
 * @Description: 53. 最大子数组和
 * @Version: 1.0
 */
public class Solution53 {

    public int maxSubArray(int[] nums) {
        /*
        dp[i] = max(dp[i - 1] + nums[i], nums[i])
        nums[i] : 当前数重新组成一个子数组
        dp[i - 1] + nums[i] : 前一个数处的最大和加上当前数，也即是把当前数加到前面的那个数组里面，不单独开一个数组
         */
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int result = dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            result = Math.max(dp[i], result);
        }
        return result;

    }
}
