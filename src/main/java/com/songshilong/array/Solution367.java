package com.songshilong.array;

public class Solution367 {


    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int left = 0;
        int right = num / 2;
        while (left <= right) {
            int mid = left + (right - left + 1) / 2;
            if ((long) mid * mid == num) {
                return true;
            } else if ((long) mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }


}
