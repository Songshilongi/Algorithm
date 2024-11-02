package com.songshilong.dynamic;

import com.sun.source.tree.ReturnTree;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-02  19:34
 * @Description: 416. 分割等和子集
 * @Version: 1.0
 */
public class Solution416 {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        int kind = nums.length;
        int[][] dp = new int[kind][target + 1];
        // 初始化背包容量
        for (int j = 0; j < target + 1; j++) {
            if (j >= nums[0]){
                dp[0][j] = nums[0];
            }
        }
        for (int i = 1; i < kind; i++) {
            for (int j = 1; j < target + 1; j++) {
                if (j - nums[i] >= 0){
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
                }else {
                    dp[i][j] = dp[i - 1][j];
                }

                if (dp[i][j] == target) {
                    return true;
                }
            }

        }
        return dp[kind - 1][target] == target;
    }


}
