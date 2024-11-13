package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-13  10:04
 * @Description: 718. 最长重复子数组
 * @Version: 1.0
 */
public class Solution718_2 {
    public int findLength(int[] nums1, int[] nums2) {
        int row = nums1.length;
        int col = nums2.length;
        int[][] dp = new int[row][col];

        int result = 0;
        // 初始化第一行
        for (int j = 0; j < col; j++) {
            if (nums1[0] == nums2[j]) {
                dp[0][j] = 1;
                result = 1; // 如果找到相等的元素，直接设置result为1
            }
        }
        // 初始化第一列
        for (int i = 0; i < row; i++) {
            if (nums1[i] == nums2[0]) {
                dp[i][0] = 1;
                result = 1; // 同上
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (nums1[i] == nums2[j]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                }
            }
        }
        return result;
    }

}
