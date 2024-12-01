package com.songshilong.hot100;

import java.util.*;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-12-01  12:57
 * @Description: 239. 滑动窗口最大值
 * @Version: 1.0
 */
public class Solution239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            // 先移除不在窗口内的元素
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            // 保证元素从大到小
            while (!deque.isEmpty() && (nums[i] > nums[deque.peekLast()])) {
                deque.removeLast();
            }
            deque.addLast(i);
            if (i >= k - 1) {
                result[index++] = nums[deque.peek()];
            }
        }
        return result;
    }

}
