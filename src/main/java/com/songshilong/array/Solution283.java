package com.songshilong.array;

public class Solution283 {

    public void moveZeroes(int[] nums) {
        int slow = 0;
        int len = nums.length;
        for (int fast = 0; fast < len; fast++) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
        }
        for (int i = slow; i < len; i++) {
            nums[i] = 0;
        }

    }



}
