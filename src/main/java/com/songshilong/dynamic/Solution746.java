package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-10-30  22:20
 * @Description: 746. 使用最小花费爬楼梯
 * @Version: 1.0
 */
public class Solution746 {

    /**
     * 利用sum[i] 记录到达第i个台阶的最小花费
     * @param cost cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。
     * @return 最小花费
     */
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int length = cost.length;
        int[] sum = new int[length];
        for (int i = 2; i < length; i++) {
            sum[i] = Math.min(sum[i - 2] + cost[i - 2], sum[i - 1] + cost[i - 1]);
        }
        return Math.min(sum[length - 1] + cost[length - 1], sum[length - 2] + cost[length - 2]);
    }
}
