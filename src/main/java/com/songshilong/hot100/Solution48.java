package com.songshilong.hot100;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-31  13:55
 * @Description: 48. 旋转图像
 * @Version: 1.0
 */
public class Solution48 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int loop = n / 2;
        int current = 0;
        while (current < loop) {
            // 对每一个圈进行移动
            int[] memory = new int[n - 2 * current - 1];

            // -->
            for (int col = current; col < n - current - 1; col++) {
                memory[col - current] = matrix[current][col];
                matrix[current][col] = matrix[n - col - 1][current];
            }
            // |
            for (int row = current; row < n - current - 1; row++) {
                int temp = matrix[row][n - current - 1];
                matrix[row][n - current - 1] = memory[row - current];
                memory[row - current] = temp;
            }
            // <--
            for (int col = n - current - 1; col > current; col--) {
                int temp = matrix[n - current - 1][col];
                matrix[n - current - 1][col] = memory[memory.length - col + current];
                memory[memory.length - col + current] = temp;
            }
            // |
            for (int row = n - current - 1; row > current; row--) {
                matrix[row][current] = memory[memory.length - row +  current];
            }
            current++;
        }
    }


    public static void main(String[] args) {
        /*
         1      2       3
         4      5       6
         7      8       9
         -->
         7  4   1
         8  5   2
         9  6   3
         */
        int[][] matrix = new int[4][4];
        matrix[0] = new int[]{5, 1, 9, 11};
        matrix[1] = new int[]{2, 4, 8, 10};
        matrix[2] = new int[]{13, 3, 6, 7};
        matrix[3] = new int[]{15, 14, 12, 16};

        int[][] test = new int[3][3];
        test[0] = new int[]{1, 2, 3};
        test[1] = new int[]{4, 5, 6};
        test[2] = new int[]{7, 8, 9};

        Solution48 solution48 = new Solution48();
        solution48.rotate(matrix);
    }


}
