package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-10-30  22:35
 * @Description: 62. 不同路径
 * @Version: 1.0
 */
public class Solution62 {


    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        int[][] matrix = new int[m][n];
        for (int col = 1; col < n; col++) {
            matrix[0][col] = 1;
        }
        for (int row = 1; row < m; row++){
            matrix[row][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
            }
        }
        return matrix[m - 1][n - 1];
    }
}
