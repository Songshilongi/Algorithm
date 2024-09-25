package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    int sum = 0;

    /**
     * 39. 组合总和<br>
     * 给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。<br>
     * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
     *
     * @param candidates 无重复元素的整数数组
     * @param target     目标整数
     * @return 所有可能结果的列表
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(candidates, target, 0);
        return result;
    }

    public void backTracking(int[] candidates, int target, int index) {
        if (sum == target) {
            result.add(new ArrayList<>(list));
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            sum = sum + candidates[i];
            backTracking(candidates, target, index++);
            sum = sum - candidates[i];
            list.removeLast();
        }
    }


}
