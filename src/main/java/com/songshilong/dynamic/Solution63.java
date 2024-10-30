package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-10-30  22:45
 * @Description: 63. 不同路径 II
 * @Version: 1.0
 */
public class Solution63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1) return 0;
        if (row == 1) {
            for (int i = 0; i < col; i++) {
                if (obstacleGrid[0][i] == 1) return 0;
            }
            return 1;
        }
        if (col == 1) {
            for (int i = 0; i < row; i++) {
                if (obstacleGrid[i][0] == 1) return 0;
            }
            return 1;
        }
        int[][] matrix = new int[row][col];
        for (int j = 1; j < col; j++) {
            if (obstacleGrid[0][j] == 0) {
                matrix[0][j] = 1;
            }else {
                break;
            }
        }
        for (int i = 1; i < row; i++) {
            if (obstacleGrid[i][0] == 0) {
                matrix[i][0] = 1;
            }else {
                break;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 0){
                    matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
                }else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix[row - 1][col - 1];
    }
}
