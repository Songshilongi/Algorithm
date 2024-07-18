package com.songshilong.array;

public class Solution59 {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int loop = 1;
        int startX = 0;
        int startY = 0; // 遍历的起始位置
        int offset = 1; // 边界
        int i, j;
        int count = 1;


        while (loop <= n / 2) {
            for (j = startY; j < n - offset; j++) {
                result[startX][j] = count++;
            }
            for (i = startX; i < n -offset; i++) {
                result[i][j] = count++;
            }
            for ( ; j > startY; j--) {
                result[i][j] = count++;
            }
            for ( ; i > startX; i--) {
                result[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
            loop++;
        }
        if (n % 2 == 1) result[startX][startY] = count;
        return result;
    }


}
