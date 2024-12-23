package com.songshilong.hot100;
import java.util.HashSet;
import java.util.Set;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-23  17:39
 * @Description: 73. 矩阵置零
 * @Version: 1.0
 */
public class Solution73 {


    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // record cleaned row and column
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 0) {
                    rowSet.add(row);
                    colSet.add(col);
                }
            }
        }

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (rowSet.contains(row) || colSet.contains(col)) {
                    matrix[row][col] = 0;
                }
            }
        }

    }
}
