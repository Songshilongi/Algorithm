package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-05  20:46
 * @Description: 518. 零钱兑换 II
 * @Version: 1.0
 */
public class Solution518 {

    public int change(int amount, int[] coins) {
        int kind = coins.length;
        int[][] dp = new int[kind][amount + 1];
        for (int i = 0; i < kind; i++) {
            dp[i][0] = 1;
        }
        for (int j = coins[0]; j < amount + 1; j++) {
            dp[0][j] = dp[0][j] + dp[0][j - coins[0]];
        }
        for (int i = 1; i < kind; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (j - coins[i] >= 0) {
                    // 使用当前数的种类 + 不使用当前数的种类。
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i]];
                }else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        return dp[kind - 1][amount];
    }


}
