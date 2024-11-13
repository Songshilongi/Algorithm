package com.songshilong.dynamic;

import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-13  09:25
 * @Description: 674. 最长连续递增序列
 * @Version: 1.0
 */
public class Solution674 {

    public int findLengthOfLCIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = 1;
        int result = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }else {
                dp[i] = 1;
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
