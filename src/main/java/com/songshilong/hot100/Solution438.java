package com.songshilong.hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-11-30  14:27
 * @Description: 438. 找到字符串中所有字母异位词
 * @Version: 1.0
 */
public class Solution438 {

    /*
    给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
     */

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        char[] chars = s.toCharArray();
        int[] show = new int[26];
        for (char c : p.toCharArray()) {
            show[c - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < chars.length; right++) {
            show[chars[right] - 'a']--;
            while (show[chars[right] - 'a'] < 0) {
                show[chars[left] - 'a']++;
                left++;
            }
            if (p.length() == right -left + 1) {
                res.add(left);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Solution438 solution438 = new Solution438();
        System.out.println(solution438.findAnagrams("abab", "ab"));
    }
}
