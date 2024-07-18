package com.songshilong.array;

public class Solution26 {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int slow = 0;
        for (int fast = 1; fast < len; fast++) {
            if (nums[fast] != nums[slow]) {
                nums[slow + 1] = nums[fast];
                slow++;
            }
        }
        return slow + 1;
    }



}
