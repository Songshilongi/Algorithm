package com.songshilong.array;

import com.sun.tools.javac.Main;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution76 {


    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> real = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        } // 记录需要字母的个数
        int left = 0;
        int right = 0;
        int valid = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                real.put(c, real.getOrDefault(c, 0) + 1);
                if (real.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (valid == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char d = s.charAt(left);
                left++;

                if (need.containsKey(d)) {
                    if (real.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    real.put(d, real.get(d) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }


}
