package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-04  21:39
 * @Description: 474. 一和零
 * @Version: 1.0
 */
public class Solution474 {

    /**
     * @param strs 元素集合
     * @param m    0的个数
     * @param n    1的个数
     * @return 最多m个0和n个1的集合个数
     */
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int zeroNumbers = 0;
            int oneNumbers = 0;
            for (char c : str.toCharArray()) {
                if (c == '0') {
                    zeroNumbers++;
                } else {
                    oneNumbers++;
                }
            }
            for (int i = m; i >= zeroNumbers; i--) {
                for (int j = n; j >= oneNumbers; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNumbers][j - oneNumbers] + 1);
                }
            }
        }
        return dp[m][n];
    }


}
