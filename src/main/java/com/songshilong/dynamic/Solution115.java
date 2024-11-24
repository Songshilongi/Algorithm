package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-24  19:51
 * @Description: 115. 不同的子序列
 * @Version: 1.0
 */
public class Solution115 {

    public int numDistinct(String s, String t) {

        if (s.isEmpty() && t.isEmpty()) {
            return 1;
        }
        char[] search = t.toCharArray();
        char[] row = s.toCharArray();

        /*
        dp[i][j]: s中下标到 i - 1的字符串在 t中下标到j - 1出现的次数。
         */
        int[][] dp = new int[search.length + 1][row.length + 1];

        for (int i = 0; i < row.length; i++) {
            if (search[0] == row[i]) {
                dp[0][i] = 1;
            }
        }

        for (int i = 1; i < search.length + 1; i++) {
            for (int j = 1; j < row.length + 1; j++) {
                if (search[i - 1] == row[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[search.length][row.length];


    }

}
