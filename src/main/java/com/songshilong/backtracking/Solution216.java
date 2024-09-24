package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution216 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();


    /**
     * 找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：<br>
     * 只使用数字1到9<br>
     * 每个数字 最多使用一次 <br>
     * 返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。<br>
     *
     * @param k k个数
     * @param n 总和是n
     * @return 所有可能的结果
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k, n, 1, 0);
        return result;
    }

    public void backTracking(int k, int n, int start, int sum) {
        if (sum > n) return;
        if (list.size() == k && sum == n) result.add(new ArrayList<>(list));
        for (int i = start; i < 10 - (k - list.size()) + 1; i++) {
            list.add(i);
            sum = sum + i;
            backTracking(k, n, i + 1, sum);
            sum = sum - i;
            list.removeLast();
        }

    }


}
