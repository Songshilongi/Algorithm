package com.songshilong.hash;

public class Solution242 {

    public boolean isAnagram(String s, String t) {
        // s t 只有小写字母。所以可以直接 a-97
        int[] record = new int[26];
        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i) - 'a'] = record[s.charAt(i) - 'a'] + 1;
        }
        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a'] = record[t.charAt(i) - 'a'] - 1;
        }
        for (int i : record) {
            if (i != 0) return false;
        }
        return true;
    }


}
