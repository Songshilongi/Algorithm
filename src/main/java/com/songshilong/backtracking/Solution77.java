package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution77 {
    /**
     * save result
     */
    List<List<Integer>> result = new ArrayList<>();
    /**
     * temp list
     */
    List<Integer> list = new ArrayList<>();

    /**
     * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。你可以按 任何顺序 返回答案。
     *
     * @param n 整数n
     * @param k 整数k
     * @return 所有可能的集合
     */
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n, k, 1);
        return result;
    }


    public void backTracking(int n, int k, int startIndex) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        /*
            剪枝优化：搜索范围上界 + 还缺几个元素 - 1 = n
            ===> 搜索范围上界 = n - 还缺几个元素 + 1 = n - (k - list.size()) + 1
         */
        for (int i = startIndex; i <= n - (k - list.size()) + 1; i++) {
            list.add(i);
            backTracking(n, k, i + 1);
            list.removeLast();
        }
    }


}
