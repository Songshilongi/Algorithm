package com.songshilong.hot100;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-11-29  17:54
 * @Description: 11. 盛最多水的容器
 * @Version: 1.0
 */
public class Solution11 {

    /*
    盛最多水的容器 --> 找到数组中 max{(j - i) * min(height[i], height[j])}
     */
    public int maxArea(int[] height) {
        int answer = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            answer = Math.max(answer, (right - left) * Math.min(height[left], height[right]));
            if (height[left] > height[right]) {
                right--;
            }else {
                left++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.maxArea(height));
    }


}
