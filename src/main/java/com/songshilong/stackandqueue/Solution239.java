package com.songshilong.stackandqueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution239 {


    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) return nums;
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int count = 0;
        // 先走k步，缓存
        deque.addLast(nums[0]);
        for (int i = 1; i < k; i++) {
            while (!deque.isEmpty() && nums[i] > deque.peekLast()) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        result[count++] = deque.peekFirst();
        for (int i = k; i < nums.length; i++) {
            if (nums[i - k] == deque.peekFirst()) deque.pollFirst();
            while (!deque.isEmpty() && nums[i] > deque.peekLast()) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            result[count++] = deque.peekFirst();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,1,2,0,5};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }


}
