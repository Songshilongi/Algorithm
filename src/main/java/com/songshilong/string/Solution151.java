package com.songshilong.string;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

public class Solution151 {


    public String reverseWords(String s) {
        // 去除收尾空格
        String str = deleteSpace(s);
        char[] array = str.toCharArray();
        int start = 0;
        for (int end = 1; end < array.length; end++) {
            if (array[end] == ' ') {
                reverse(array, start, end - 1);
                start = end + 1;
            }
        }
        reverse(array, start, array.length - 1);
        reverse(array, 0, array.length - 1);
        return String.valueOf(array);
    }

    public String deleteSpace(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int left = 0;
        int right = str.length() - 1;
        while (str.charAt(left) == ' ') left++;
        while (str.charAt(right) == ' ') right--;
        while (left <= right) {
            char c = str.charAt(left);
            if (c != ' ' || stringBuilder.charAt(stringBuilder.length() - 1) != ' ') {
                stringBuilder.append(c);
            }
            left++;
        }
        return stringBuilder.toString();

    }

    public void reverse(char[] array, int start, int end) {
        int left = start;
        int right = end;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            right--;
            left++;
        }
    }


}
