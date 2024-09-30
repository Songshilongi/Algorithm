package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 46
 */
public class Solution46 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backTracking(nums, new int[nums.length]);
        return result;
    }

    public void backTracking(int[] nums, int[] memory) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (memory[i] == 1) continue;
            list.add(nums[i]);
            memory[i] = 1;
            backTracking(nums, memory);
            memory[i] = 0;
            list.removeLast();
        }
    }
}
