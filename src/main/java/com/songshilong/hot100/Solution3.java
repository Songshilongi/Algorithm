package com.songshilong.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-11-30  14:07
 * @Description: 3. 无重复字符的最长子串
 * @Version: 1.0
 */
public class Solution3 {
    /*
    给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度。
     */

    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        map.put(chars[left], 1);
        int result = 1;
        for (int right = 1; right < chars.length; right++) {
            while (map.getOrDefault(chars[right], 0) != 0) {
                map.put(chars[left], map.get(chars[left]) - 1);
                left++;
            }

            map.put(chars[right], 1);
            result = Math.max(result, right - left + 1);

        }
        return result;
    }


}
