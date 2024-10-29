package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-10-29  20:29
 * @Description: 509. 斐波那契数
 * @Version: 1.0
 */
public class Solution509 {

    public int fib(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        int x = 0;
        int y = 1;
        int z = 0;
        for (int i = 1; i < n; i++) {
            z = y + x;
            int temp = y;
            y = z;
            x = temp;
        }
        return z;
    }
}
