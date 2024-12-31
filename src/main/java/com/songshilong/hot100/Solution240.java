package com.songshilong.hot100;

import java.util.concurrent.TransferQueue;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-31  15:13
 * @Description: 240. 搜索二维矩阵 II
 * @Version: 1.0
 */
public class Solution240 {

    /*
    编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
    每行的元素从左到右升序排列。
    每列的元素从上到下升序排列。
     */

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix[0][0] > target) {
            return false;
        }
        if (matrix[0][0] == target) {
            return true;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            int number = matrix[row][col];
            if (number == target) {
                return true;
            } else if (number < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        matrix[0] = new int[]{1, 4, 7, 11, 15};
        matrix[1] = new int[]{2, 5, 8, 12, 19};
        matrix[2] = new int[]{3, 6, 9, 16, 22};
        matrix[3] = new int[]{10, 13, 14, 17, 24};
        matrix[4] = new int[]{18, 21, 23, 26, 30};
        Solution240 solution240 = new Solution240();
        System.out.println(solution240.searchMatrix(matrix, 5));
    }

}
