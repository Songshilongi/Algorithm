package com.songshilong.greedy;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-18  21:16
 * @Description: 860. 柠檬水找零
 * @Version: 1.0
 */
public class Solution860 {

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                five--;
                ten++;
            } else if (bill == 20) {
                if (ten > 0) {
                    five--;
                    ten--;
                } else {
                    five = five - 3;
                }
                twenty++;
            }
            if (five < 0 || ten < 0 || twenty < 0) {
                return false;
            }
        }
        return true;
    }

}
