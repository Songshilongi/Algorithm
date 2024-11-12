package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-12  21:56
 * @Description: 309. 买卖股票的最佳时机含冷冻期
 * @Version: 1.0
 */
public class Solution309 {

    public int maxProfit(int[] prices) {

        int length = prices.length;
        int[][] dp = new int[length][4];
        /*
        0: 处于持有股票的状态
        1: 今天卖出股票
        2: 处于卖出股票的状态
        3: 处于冷静期(前一天是卖出股票)
         */
        dp[0][0] = -prices[0];
        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][2] - prices[i], dp[i - 1][3] - prices[i]));
            dp[i][1] = dp[i - 1][0] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][3]);
            dp[i][3] = dp[i - 1][1];
        }
        return Math.max(dp[length - 1][1], Math.max(dp[length - 1][2], dp[length - 1][3]));
    }
}
