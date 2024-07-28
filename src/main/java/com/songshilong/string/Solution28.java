package com.songshilong.string;

public class Solution28 {


    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        char[] h = haystack.toCharArray();
        char[] p = needle.toCharArray();
        for (int i = 0; i <= m - n; i++) {
            int a = i;
            int b = 0;
            while (b < n && h[a] == p[b]) {
                a++;
                b++;
            }
            if (b == n) {
                return i;
            }
        }
        return -1;
    }


}
