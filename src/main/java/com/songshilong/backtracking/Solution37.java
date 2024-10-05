package com.songshilong.backtracking;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.backtracking
 * @Author: Song shi long
 * @CreateTime: 2024-10-05  21:29
 * @Description: 37 解数独
 * @Version: 1.0
 */
public class Solution37 {

    public void solveSudoku(char[][] board) {
        boolean[][] rowUsed = new boolean[9][10];
        boolean[][] colUsed = new boolean[9][10];
        boolean[][][] boxUsed = new boolean[3][3][10];
        // 初始化棋盘的使用情况  9*9的棋盘
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int num = board[row][col] - '0';
                if (num >= 0 && num <= 9) {
                    rowUsed[row][num] = true;
                    colUsed[col][num] = true;
                    boxUsed[row / 3][col / 3][num] = true;
                }
            }
        }

        backTracking(board, 0, 0, rowUsed, colUsed, boxUsed);
    }

    public boolean backTracking(char[][] board, int row, int col, boolean[][] rowUsed, boolean[][] colUsed, boolean[][][] boxUsed) {
        // 一行一行填充，校验是否全部填充完毕
        if (col == 9) {
            col = 0;
            row++;
            if (row == 9) return true;
        }

        if (board[row][col] == '.') {
            // 对当前格子填充1到9
            for (int num = 1; num <= 9; num++) {
                boolean canUse = !(rowUsed[row][num] || colUsed[col][num] || boxUsed[row / 3][col / 3][num]);
                if (canUse) {
                    rowUsed[row][num] = true;
                    colUsed[col][num] = true;
                    boxUsed[row / 3][col / 3][num] = true;
                    board[row][col] = (char) (num + '0');
                    if (backTracking(board, row, col + 1, rowUsed, colUsed, boxUsed)) {
                        return true;
                    }
                    board[row][col] = '.';
                    rowUsed[row][num] = false;
                    colUsed[col][num] = false;
                    boxUsed[row / 3][col / 3][num] = false;
                }
            }

        } else {
             return backTracking(board, row, col + 1, rowUsed, colUsed, boxUsed);
        }
        return false;
    }

}
