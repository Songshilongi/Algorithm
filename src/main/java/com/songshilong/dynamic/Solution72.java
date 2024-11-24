package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-24  20:25
 * @Description: 72. 编辑距离
 * @Version: 1.0
 */
public class Solution72 {

    public int minDistance(String word1, String word2) {
        if (word1.isEmpty() && word2.isEmpty()) {
            return 0;
        }

        char[] row = word1.toCharArray();
        char[] search = word2.toCharArray();

        int[][] dp = new int[row.length + 1][search.length + 1];

        for (int i = 0; i < row.length + 1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < search.length + 1; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < row.length + 1; i++) {
            for (int j = 1; j < search.length + 1; j++) {
                if (row[i - 1] == search[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // 删除或者替换
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + 1, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
                }
            }
        }

        return dp[row.length][search.length];
    }
}
