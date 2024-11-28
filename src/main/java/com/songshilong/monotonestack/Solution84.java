package com.songshilong.monotonestack;

import java.util.Stack;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.monotonestack
 * @Author: Song shi long
 * @CreateTime: 2024-11-28  14:44
 * @Description: 84. 柱状图中最大的矩形
 * @Version: 1.0
 */
public class Solution84 {

    /*
    |栈底-------------------栈头|
    | 1, 2, 3, 4.........|
    找左右两边第一个小于该元素的，计算面积
     */


    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= len; i++) {
            while (!stack.isEmpty() && (i == len || heights[i] < heights[stack.peek()])) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i; // 栈为空，说明这个柱子左侧没有比它矮的柱子
                } else {
                    width = i - stack.peek() - 1; // 不为空，说明左边有比踏矮的柱子
                }
                result = Math.max(result, height * width); // 更新最大面积
            }
            stack.push(i);
        }
        return result;
    }

}
