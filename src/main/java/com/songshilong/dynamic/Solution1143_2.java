package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-13  10:21
 * @Description: 1143. 最长公共子序列
 * @Version: 1.0
 */
public class Solution1143_2 {

    public int longestCommonSubsequence(String text1, String text2) {
        int row = text1.length();
        int col = text2.length();
        int[][] dp = new int[row][col];

        for (int j = 0; j < col; j++) {
            if (text1.charAt(0) == text2.charAt(j)) {
                for (int i = j; i < col; i++) {
                    dp[0][i] = 1;
                }
                break;
            }
        }
        for (int i = 0; i < row; i++) {
            if (text1.charAt(i) == text2.charAt(0)) {
                for (int j = i; j < row; j++) {
                    dp[j][0] = 1;
                }
                break;

            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[row - 1][col - 1];

    }

}
