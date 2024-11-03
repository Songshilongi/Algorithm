package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-03  18:55
 * @Description: 494. 目标和   (回溯算法)
 * @Version: 1.0
 */
public class Solution494_1 {
    int result = 0;

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((sum + target) % 2 == 1) return 0;
        int newTarget = (sum + target) / 2;
        rollBack(nums, 0, newTarget, 0);
        return result;

    }

    private void rollBack(int[] nums, int sum, int target, int start) {
        if (sum == target) result++;
        for (int i = start; i < nums.length; i++) {
            sum = sum + nums[i];
            rollBack(nums, sum, target, i + 1);
            sum = sum - nums[i];
        }
    }
}
