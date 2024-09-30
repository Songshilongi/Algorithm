package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 47. 全排列 II
 */
public class Solution47 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums, new int[nums.length]);
        return result;
    }

    public void backtracking(int[] nums, int[] memory) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && memory[i - 1] == 0) continue;
            if (memory[i] == 1) continue;
            list.add(nums[i]);
            memory[i] = 1;
            backtracking(nums, memory);
            memory[i] = 0;
            list.removeLast();
        }
    }
}
