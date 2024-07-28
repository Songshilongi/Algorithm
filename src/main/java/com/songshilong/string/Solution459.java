package com.songshilong.string;

public class Solution459 {

    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() -1 ).contains(s);


    }


}
