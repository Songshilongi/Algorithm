package com.songshilong.greedy;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-09  20:22
 * @Description: 买卖股票的最佳时机 II
 * @Version: 1.0
 */
public class Solution122 {

    public int maxProfit(int[] prices) {
        int result = 0;
        int curDiff = 0;
        for (int i = 1; i < prices.length; i++) {
            curDiff = prices[i] - prices[i - 1];
            if (curDiff > 0) result = result + curDiff;
        }
        return result;
    }
}
