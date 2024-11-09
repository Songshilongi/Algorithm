package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-09  15:01
 * @Description: 188. 买卖股票的最佳时机 IV
 * @Version: 1.0
 */
public class Solution188 {

    public int maxProfit(int k, int[] prices) {
        int kind = prices.length;
        int[][] dp = new int[kind][2 * k + 1];
        // 初始化dp数组 1 3 5 7 等等 2k - 1次的时候都是 -prices[0]
        for (int i = 1; i <= k; i++) {
            dp[0][2 * i - 1] = -prices[0];
        }
        for (int i = 1; i < kind; i++) {
            for (int j = 1; j <= 2 * k; j++) {
                if (j % 2 == 1) {
                    if (j == 1) {
                        dp[i][j] = Math.max(dp[i - 1][j], -prices[i]);
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1] - prices[i]);
                    }
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1] + prices[i]);
                }
            }

        }
        return dp[kind - 1][2 * k];
    }


}
