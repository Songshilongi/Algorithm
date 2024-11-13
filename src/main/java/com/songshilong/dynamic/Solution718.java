package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-13  09:35
 * @Description: 718. 最长重复子数组
 * @Version: 1.0
 */
public class Solution718 {

    public int findLength(int[] nums1, int[] nums2) {
        int row = nums1.length;
        int col = nums2.length;
        int[][] dp = new int[row + 1][col + 1];

        int result = 0;
        for (int i = 1; i < row + 1; i++) {
            for (int j = 1; j < col + 1; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                }
            }
        }
        return result;
    }

}
