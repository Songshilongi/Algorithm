package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Solution17 {

    List<String> result = new ArrayList<>();
    StringBuilder builder = new StringBuilder();
    //                  0    1    2      3      4      5      6     7       8       9
    String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    /**
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。<br>
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     *
     * @param digits 输入的仅包含数字的字符串
     * @return 所有可能的组合
     */
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return result;
        backTracking(digits, 0);
        return result;
    }
    public void backTracking(String digits, int index){

        if (digits.length() == builder.length()) {
            result.add(builder.toString());
            return;
        }
        // 获取当前数字对应的映射
        String str = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i));
            backTracking(digits, index + 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
