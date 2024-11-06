package com.songshilong.dynamic;

import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-06  21:07
 * @Description: 279. 完全平方数
 * @Version: 1.0
 */
public class Solution279 {
    public int numSquares(int n) {
        int kind = (int) Math.sqrt(n);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int j = 1; j < n + 1; j++) {
            for (int i = 1; i <= kind; i++) {
                if (j - i * i >= 0 ) {
                    dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
                }
            }
        }
        return dp[n];
    }
}
