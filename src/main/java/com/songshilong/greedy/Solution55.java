package com.songshilong.greedy;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-11  20:52
 * @Description: 55. 跳跃游戏
 * @Version: 1.0
 */
public class Solution55 {

    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int range = 0;
        for (int i = 0; i <= range; i++) {
            range = Math.max(range, nums[i] + i);
            if (range >= nums.length - 1) return true;
        }
        return false;
    }
}
