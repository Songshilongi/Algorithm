package com.songshilong.hash;

import java.util.HashMap;
import java.util.Map;

public class Solution383 {

    // 判断 ransomNote 能不能由 magazine 里面的字符构成
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (Character c : ransomNote.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            }else {
                return false;
            }
        }
        return true;
    }


}
