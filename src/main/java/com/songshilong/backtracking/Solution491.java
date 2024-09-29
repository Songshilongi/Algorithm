package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
*@BelongsProject: Algorithm
*@BelongsPackage: com.songshilong.backtracking
*@Author: Song shi long
*@CreateTime: 2024-09-29  20:28
*@Description: 491. 非递减子序列
*@Version: 1.0
*/
public class Solution491 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backTracking(nums, 0);
        return result;
    }

    private void backTracking(int[] nums, int index) {
        if (list.size() > 1) {
            result.add(new ArrayList<>(list));
        }
        Set<Integer> set = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (!list.isEmpty() && nums[i] < list.getLast()) continue;
            if (set.contains(nums[i])) continue;
            list.add(nums[i]);
            set.add(nums[i]);
            backTracking(nums, i + 1);
            list.removeLast();
        }
    }


}
