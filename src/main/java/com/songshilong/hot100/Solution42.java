package com.songshilong.hot100;

import javax.xml.transform.Result;
import java.util.Stack;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-11-30  13:54
 * @Description: 42. 接雨水
 * @Version: 1.0
 */
public class Solution42 {

    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int result = 0;
        for (int i = 1; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int distance = i - stack.peek() - 1;
                int h = Math.min(height[i], height[stack.peek()]) - height[top];
                result =  result + distance * h;
            }
            stack.push(i);
        }
        return result;
    }

}
