package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Solution90 {


    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (Objects.isNull(nums) || nums.length == 0) return result;
        Arrays.sort(nums);
        backTracking(nums, 0);
        return result;
    }

    private void backTracking(int[] nums, int index) {
        result.add(new ArrayList<>(list));
        if (index > nums.length - 1) return;
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            backTracking(nums, i + 1);
            list.removeLast();
        }
    }


}
