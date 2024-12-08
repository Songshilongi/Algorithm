package com.songshilong.hot100;

import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-12-08  20:02
 * @Description: 189. 轮转数组
 * @Version: 1.0
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        this.reverse(nums, 0, nums.length - 1);
        this.reverse(nums, 0, k - 1);
        this.reverse(nums, k, nums.length - 1);
    }

    /*
    reverse where start <= i <= end
     */
     private void reverse(int[] nums, int start, int end) {
         while (start <= end) {
             int temp = nums[end];
             nums[end] = nums[start];
             nums[start] = temp;
             start++;
             end--;
         }
     }
}
