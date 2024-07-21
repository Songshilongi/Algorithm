package com.songshilong.hash;

import java.util.HashSet;

public class Solution202 {

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while (sum != 1) {
            sum = getSum(n);
            if (!set.contains(sum)) {
                set.add(sum);
            } else {
                return false;
            }
            n = sum;
        }
        return true;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
