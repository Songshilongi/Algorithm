package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-12  22:24
 * @Description: 714. 买卖股票的最佳时机含手续费
 * @Version: 1.0
 */
public class Solution714 {

    public int maxProfit(int[] prices, int fee) {
        int length = prices.length;
        int[][] dp = new int[length][2];
        /*
        0: 持有股票
        1: 不持有股票
         */
        dp[0][0] = -prices[0];
        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i] - fee);
        }
        return dp[length - 1][1];
    }
}
