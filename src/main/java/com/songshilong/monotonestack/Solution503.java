package com.songshilong.monotonestack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.monotonestack
 * @Author: Song shi long
 * @CreateTime: 2024-11-26  15:56
 * @Description: 503. 下一个更大元素 II
 * @Version: 1.0
 */
public class Solution503 {



    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;

        int[] answer = new int[len];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < 2 * len; i++) {
            while (!stack.isEmpty() && nums[i % len] > nums[stack.peek()]) {
                answer[stack.peek()] = nums[i % len];
                stack.pop();
            }
            stack.push(i % len);
        }
        return answer;
    }

}
