package com.songshilong.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-12-07  19:46
 * @Description: 76. 最小覆盖子串
 * @Version: 1.0
 */
public class Solution76 {

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        // 记录出现的次数
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // 记录有效的个数
        int valid = 0;
        int left = 0;
        String answer = "";
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (map.containsKey(current)) {
                map.put(current, map.get(current) - 1);
                if (map.get(current) == 0) {
                    valid++;
                }
            }
            while (valid == map.size() && left <= right) {
                String temp = s.substring(left, right + 1);
                if (answer.isEmpty()) {
                    answer = temp;
                } else {
                    answer = temp.length() <= answer.length() ? temp : answer;
                }
                if (map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    if (map.get(s.charAt(left)) > 0) {
                        valid--;
                    }
                }
                left++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution76 solution76 = new Solution76();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(solution76.minWindow(s, t));
    }
}
