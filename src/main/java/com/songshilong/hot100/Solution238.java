package com.songshilong.hot100;

import javax.sound.midi.Soundbank;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-23  16:16
 * @Description: 除自身以外数组的乘积
 * @Version: 1.0
 */
public class Solution238 {
    /**
     * 前缀之积 和 后缀之积
     */
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        // 先前缀
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        // 在后缀
        int temp = 1;
        for (int i = nums.length - 2; i >= 0 ; i--) {
            temp = temp * nums[i + 1];
            answer[i] = answer[i] * temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        Solution238 solution238 = new Solution238();
        solution238.productExceptSelf(nums);
    }
}
