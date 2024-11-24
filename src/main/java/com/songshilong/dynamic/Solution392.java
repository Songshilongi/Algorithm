package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-24  19:19
 * @Description: 392. 判断子序列
 * @Version: 1.0
 */
public class Solution392 {
    public boolean isSubsequence(String s, String t) {

        if (s.isEmpty() && t.isEmpty()) {
            return true;
        }

        char[] search = s.toCharArray();
        char[] row = t.toCharArray();

        // 下标为 i - 1， j - 1字符相同的个数
        int[][] dp = new int[row.length + 1][search.length + 1];

        for (int i = 1; i < row.length + 1; i++) {
            for (int j = 1; j < search.length +1; j++) {
                if (row[i - 1] == search[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[row.length][search.length] == search.length;
    }
}
