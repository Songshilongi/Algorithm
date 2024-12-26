package com.songshilong.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-26  17:59
 * @Description: 54. 螺旋矩阵
 * @Version: 1.0
 */
public class Solution54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        // m * n 的矩阵
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0; // 顶部
        int bottom = m - 1; // 底部
        int left = 0; // 左边
        int right = n - 1; // 右边

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;


            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }


            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0] = new int[]{1, 2, 3, 4};
        matrix[1] = new int[]{5, 6, 7, 8};
        matrix[2] = new int[]{9, 10, 11, 12};
        System.out.println(new Solution54().spiralOrder(matrix));
    }

}
