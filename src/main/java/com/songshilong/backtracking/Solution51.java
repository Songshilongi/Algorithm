package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.backtracking
 * @Author: Song shi long
 * @CreateTime: 2024-10-02  19:54
 * @Description: 51 N皇后
 * @Version: 1.0
 */
public class Solution51 {

    List<List<String>> result = new ArrayList<>();
    String[][] matrix;
    int[] used;

    public List<List<String>> solveNQueens(int n) {
        // 初始化棋盘
        matrix = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ".";
            }
        }
        // 记录每一列被使用的情况
        used = new int[n];
        backTracking(matrix, 0);
        return result;
    }

    /**
     * 回溯算法
     *
     * @param matrix 棋盘矩阵
     * @param row    记录当前已经有多少行了
     */
    public void backTracking(String[][] matrix, int row) {
        if (row == matrix.length) {
            result.add(matrixToList(matrix));
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (used[i] == 1) continue;
            matrix[row][i] = "Q";
            if (!evaluate(matrix, row, i)) {
                matrix[row][i] = ".";
                continue;
            }
            used[i] = 1;
            backTracking(matrix, row + 1);
            used[i] = 0;
            matrix[row][i] = ".";
        }

    }


    /**
     * 判断对角线上是否满足条件
     *
     * @param matrix 棋盘矩阵
     * @param row    当前棋子 所在行
     * @param column 当前棋子 所在列
     * @return true-对角线满足条件
     */
    public boolean evaluate(String[][] matrix, int row, int column) {
        if (row == 0) return true;
        int left = column - 1;
        int right = column + 1;
        for (int i = row - 1; i >= 0; i--) {
            if (left >= 0) {
                if (matrix[i][left].equals("Q")) return false;
                left--;
            }
            if (right <= matrix.length - 1) {
                if (matrix[i][right].equals("Q")) return false;
                right++;
            }
        }
        return true;
    }


    public List<String> matrixToList(String[][] matrix) {

        List<String> list = new ArrayList<>();
        for (String[] strings : matrix) {
            StringBuilder builder = new StringBuilder();
            for (String string : strings) {
                builder.append(string);
            }
            list.add(builder.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        Solution51 solution51 = new Solution51();
        solution51.solveNQueens(4);
    }
}
