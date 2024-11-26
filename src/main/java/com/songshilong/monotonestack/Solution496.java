package com.songshilong.monotonestack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.monotonestack
 * @Author: Song shi long
 * @CreateTime: 2024-11-26  15:35
 * @Description: 496. 下一个更大元素 I
 * @Version: 1.0
 */
public class Solution496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] temp = this.findFirst(nums2);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], temp[i]);
        }
        int[] answer = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            answer[i] = map.get(nums1[i]);
        }
        return answer;
    }

    private int[] findFirst(int[] nums2) {
        int[] result = new int[nums2.length];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i] <= nums2[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                    result[stack.peek()] = nums2[i];
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2,4};
        int[] nums2 = new int[]{1,2,3,4};

        Solution496 solution496 = new Solution496();
        solution496.nextGreaterElement(nums1, nums2);
    }


}
