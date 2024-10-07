package com.songshilong.greedy;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-07  19:01
 * @Description: 376. 摆动序列
 * @Version: 1.0
 */
public class Solution376 {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        if (nums.length == 2) {
            if (nums[0] == nums[1]) {
                return 1;
            }
            return 2;
        }
        int result = 1;
        int preDiff = 0;
        int curDiff = 0;
        for (int i = 1; i < nums.length; i++) {
            curDiff = nums[i] - nums[i - 1];
            if ((curDiff > 0 && preDiff <= 0) || (curDiff < 0 && preDiff >= 0)) {
                result++;
                preDiff = curDiff;
            }
        }
        return result;
    }
}
