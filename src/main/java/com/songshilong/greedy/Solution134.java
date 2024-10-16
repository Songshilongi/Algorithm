package com.songshilong.greedy;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-16  20:28
 * @Description: 加油站
 * @Version: 1.0
 */
public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int start = 0;
        int diff = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            diff += gas[i] - cost[i];
            if (diff < 0) {
                start = i + 1;
                diff = 0;
            }
        }
        if (totalGas < totalCost) {
            return -1;
        }
        return start;
    }
}
