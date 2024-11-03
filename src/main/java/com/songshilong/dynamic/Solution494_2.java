package com.songshilong.dynamic;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-03  19:06
 * @Description: 494. 目标和   （动态规划）
 * @Version: 1.0
 */
public class Solution494_2 {

    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum < Math.abs(target)) {
            return 0;
        }
        if ((sum + target) % 2 == 1) return 0;
        int newTarget = (sum + target) / 2;
        int[][] dp = new int[nums.length][newTarget + 1];
        if (nums[0] <= newTarget) {
            dp[0][nums[0]] = 1;
        }
        int pow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                pow++;
            }
            dp[i][0] = (int) Math.pow(2, pow);

        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j <= newTarget; j++) {
                if (j - nums[i] >= 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i]];
                }else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        return dp[nums.length - 1][newTarget];

    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1};
        Solution494_2 solution4942 = new Solution494_2();
        System.out.println(solution4942.findTargetSumWays(nums, 3));
    }

}
