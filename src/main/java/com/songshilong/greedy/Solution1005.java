package com.songshilong.greedy;

import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-14  20:44
 * @Description: 1005. K 次取反后最大化的数组和
 * @Version: 1.0
 */
public class Solution1005 {


    /**
     * <a href = "https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations/description/">1005. K 次取反后最大化的数组和</a>
     *
     * @param nums 给定的整数数组
     * @param k    翻转猴哥元素K次
     * @return 修改数组后，可能的最大和
     */
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                k--;
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);
        int result = 0;
        result = Arrays.stream(nums).sum();
        if (k % 2 == 0) return result;
        return result - nums[0] * 2;
    }

}
