package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-01  20:37
 * @Description: 343. 整数拆分
 * @Version: 1.0
 */
public class Solution343 {

    public int integerBreak(int n) {
        if (n == 2) return 1;
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n ; i++) {
            for (int j = 1; j <= i - j; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        return dp[n];
    }
}
