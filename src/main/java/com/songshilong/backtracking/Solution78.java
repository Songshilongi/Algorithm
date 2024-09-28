package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * 78. 子集
 */
public class Solution78 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        if (Objects.isNull(nums) || nums.length == 0) return result;
        backTracking(nums, 0);
        return result;
    }

    private void backTracking(int[] nums, int index) {
        result.add(new ArrayList<>(list));
        if (index > nums.length - 1) return;
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backTracking(nums, i + 1);
            list.removeLast();
        }
    }

}
