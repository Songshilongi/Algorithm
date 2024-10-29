package com.songshilong.greedy;

import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-29  19:24
 * @Description: 738. 单调递增的数字
 * @Version: 1.0
 */
public class Solution738 {

    public int monotoneIncreasingDigits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int startIndex = chars.length;
        for (int i = chars.length - 2; i >= 0; i--) {
            if (chars[i] > chars[i + 1]) {
                chars[i]--;
                startIndex = i + 1;
            }
        }
        for (int i = startIndex; i < chars.length; i++) {
            chars[i] = '9';
        }
        String result = String.valueOf(chars);
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        Solution738 solution = new Solution738();
        System.out.println(solution.monotoneIncreasingDigits(10));
    }
}
