package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-09  14:09
 * @Description: 121. 买卖股票的最佳时机
 * @Version: 1.0
 */
public class Solution121 {

    public int maxProfit(int[] prices) {
        int length = prices.length;
        int[][] dp = new int[length][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < length; i++) {
            // 持有- 前一天不持有或者当天买入的最大值
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            // 不持有- 前一天不持有 或者前一天持有当天卖出
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        }
        return dp[length - 1][1];
    }
}
