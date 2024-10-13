package com.songshilong.greedy;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-13  10:39
 * @Description: 45. 跳跃游戏 II
 * @Version: 1.0
 */
public class Solution45 {


    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int result = 0;
        int maxIndex = 0;
        while (maxIndex + nums[maxIndex] < nums.length - 1) {
            result++;
            maxIndex = findMaxIndex(nums, maxIndex);
        }
        return result + 1;
    }

    /**
     * 寻找从startIndex开始，在[startIndex + 1, startIndex +nums[startIndex] ] 范围内可以跳远到最远的索引值
     * @param nums 给定的数组
     * @param startIndex 起始索引
     * @return 拥有最远跳跃范围的索引
     */
    private int findMaxIndex(int[] nums, int startIndex) {
        int result = startIndex + 1;
        for (int i = startIndex + 1; i <= startIndex + nums[startIndex]; i++) {
            if (i + nums[i] > result + nums[result]) {
                result = i;
            }
        }
        return result;
    }
}
