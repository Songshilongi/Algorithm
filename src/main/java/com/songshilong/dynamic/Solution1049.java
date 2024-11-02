package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-02  19:45
 * @Description: 1049. 最后一块石头的重量 II
 * @Version: 1.0
 */
public class Solution1049 {

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum = sum + stone;
        }
        int target = sum / 2;
        int[][] dp = new int[stones.length][target + 1];
        for (int j = stones[0]; j < target + 1; j++) {
            dp[0][j] = stones[0];
        }
        for (int i = 1; i < stones.length; i++) {
            for (int j = 1; j < target + 1; j++) {
                if (j - stones[i] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stones[i]] + stones[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return sum - dp[stones.length - 1][target] * 2;
    }

}
