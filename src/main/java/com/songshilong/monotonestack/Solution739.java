package com.songshilong.monotonestack;

import java.util.Stack;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.monotonestack
 * @Author: Song shi long
 * @CreateTime: 2024-11-26  15:12
 * @Description: 739. 每日温度
 * @Version: 1.0
 */
public class Solution739 {


    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] answer = new int[len];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < len; i++) {
            if (temperatures[i] <= temperatures[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    answer[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        Solution739 solution739 = new Solution739();
        solution739.dailyTemperatures(temperatures);
    }

}
