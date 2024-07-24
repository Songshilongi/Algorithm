package com.songshilong.string;

public class Solution541 {

    public String reverseStr(String s, int k) {

        if (s.length() ==  1) return s;

        char[] array = s.toCharArray();
        int len = array.length;
        int loop = len / k;

        int count = 0;
        while (loop > 0) {
            int start = 2 * count * k;
            int end = start + k - 1;
            reverse(array, start, end);
            count++;
            loop = loop - 2;
        }
        loop = len / k;
        int remain = len % k;
        if (loop % 2 == 0) {
            reverse(array, 2 * count * k, 2 * count * k + remain - 1);
        }

        return String.valueOf(array);
    }

    public void reverse(char[] array, int start, int end) {
        int left = start;
        int right = end;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }


}
