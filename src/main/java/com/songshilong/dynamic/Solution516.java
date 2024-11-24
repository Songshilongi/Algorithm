package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-24  21:09
 * @Description: 516. 最长回文子序列
 * @Version: 1.0
 */
public class Solution516 {

    public int longestPalindromeSubseq(String s) {
        char[] row = s.toCharArray();
        int len = row.length;
        int[][] dp = new int[len][len];

        for (int i = len - 1; i>=0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (row[i] == row[j]) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j - 1], Math.max(dp[i + 1][j], dp[i][j - 1]));
                }
            }

        }
        return dp[0][len - 1];

    }


}
