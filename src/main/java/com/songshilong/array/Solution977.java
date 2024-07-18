package com.songshilong.array;

public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int left = 0;
        int right = len - 1;
        int index = len - 1;
        while (left <= right) {
            if (nums[right] * nums[right] >= nums[left] * nums[left]) {
                result[index--] = nums[right] * nums[right];
                right--;
            } else {
                result[index--] = nums[left] * nums[left];
                left++;
            }
        }
        return result;

    }


}
