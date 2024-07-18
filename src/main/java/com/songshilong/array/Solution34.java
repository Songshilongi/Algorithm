package com.songshilong.array;

public class Solution34 {


    public int[] searchRange(int[] nums, int target) {
        int left = getLeft(nums, target);
        int right = getRight(nums, target);
        if (left == -2 || right == -2) return new int[]{-1, -1};
        if (right - left > 1) return new int[]{left + 1, right - 1};
        return new int[]{-1, -1};


    }

    public int getLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            leftBorder = right;
        }
        return leftBorder;
    }


    public int getRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            rightBorder = left;
        }
        return rightBorder;
    }


}
