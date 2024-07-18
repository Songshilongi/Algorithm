package com.songshilong.array;


public class Solution844 {


    public boolean backspaceCompare(String s, String t) {
        return construct(s).equals(construct(t));
    }
    public String construct(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        int skip = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '#') {
                skip++;
            } else if (skip > 0) {
                skip--;
            } else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }


}
