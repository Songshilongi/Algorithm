package com.songshilong.array;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length; // m * n 的矩阵
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        while (top <= bottom && left <= right) {
            // 遍历行元素
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;

                if (left <= right) {
                    for (int j = right; j >= left; j--) {
                        result.add(matrix[bottom][j]);
                    }
                    bottom--;

                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            }

        }
        return result;
    }


}
