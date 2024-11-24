package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-24  20:06
 * @Description: 583. 两个字符串的删除操作
 * @Version: 1.0
 */
public class Solution583 {


    public int minDistance(String word1, String word2) {
        if (word1.isEmpty() && word2.isEmpty()) {
            return 0;
        }
        char[] row = word1.toCharArray();
        char[] search = word2.toCharArray();

        int[][] dp = new int[row.length + 1][search.length + 1];

        for (int i = 1; i < row.length + 1; i++) {
            for (int j = 1; j < search.length + 1; j++) {
                if (row[i - 1] == search[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return row.length + search.length - 2 * dp[row.length][search.length];


    }

}
