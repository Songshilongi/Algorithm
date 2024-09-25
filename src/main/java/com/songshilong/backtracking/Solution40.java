package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    int sum = 0;

    /**
     * <a href="https://leetcode.cn/problems/combination-sum-ii/">40. 组合总和 II</a>
     *
     * @param candidates 给定的数组
     * @param target     目标整数
     * @return 所有可能的结果
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates, target, 0);
        return result;
    }

    public void backTracking(int[] candidates, int target, int index) {
        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            list.add(candidates[i]);
            sum = sum + candidates[i];
            backTracking(candidates, target, i + 1);
            sum = sum - candidates[i];
            list.removeLast();
        }
    }
}
