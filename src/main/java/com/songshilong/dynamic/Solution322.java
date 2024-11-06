package com.songshilong.dynamic;

import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-06  20:24
 * @Description: 322. 零钱兑换
 * @Version: 1.0
 */
public class Solution322 {

    public int coinChange(int[] coins, int amount) {

        int kind = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int j = 1; j < amount + 1; j++) {
            for (int i = 0; i < kind; i++) {
                if (j - coins[i] >= 0 && dp[j - coins[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {

        Solution322 solution322 = new Solution322();
        int[] coins = new int[]{1, 2, 5};
//        int[] coins = new int[]{2};
        System.out.println(solution322.coinChange(coins, 11));
    }


}
