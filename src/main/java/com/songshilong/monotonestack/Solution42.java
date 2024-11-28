package com.songshilong.monotonestack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.monotonestack
 * @Author: Song shi long
 * @CreateTime: 2024-11-28  09:05
 * @Description: 42. 接雨水
 * @Version: 1.0
 */
public class Solution42 {

    public int trap(int[] height) {

        int len = height.length;
        if (len <= 2) {
            return 0;
        }
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < len; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int distance = i - stack.peek() - 1;
                int temp = Math.min(height[i], height[stack.peek()]);
                int h = temp - height[top];
                answer = answer + h * distance;
            }
            stack.push(i);
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] nums2 = new int[]{4, 2, 3};
        Solution42 solution42 = new Solution42();
        System.out.println(solution42.trap(nums1));
    }


}
