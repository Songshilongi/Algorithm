package com.songshilong.hot100;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-11-29  17:46
 * @Description: 283. 移动零
 * @Version: 1.0
 */
public class Solution283 {


    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] == 0) {
                continue;
            }
            nums[slow] = nums[fast];
            slow++;
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
