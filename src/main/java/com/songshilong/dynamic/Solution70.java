package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-10-29  20:42
 * @Description: 70. 爬楼梯
 * @Version: 1.0
 */
public class Solution70 {

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int x = 1;
        int y = 2;
        int z = 0;
        for (int i = 3; i <= n; i++) {
            z = y + x;
            x = y;
            y = z;
        }
        return z;
    }
}
