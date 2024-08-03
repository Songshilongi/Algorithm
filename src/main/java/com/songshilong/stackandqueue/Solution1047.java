package com.songshilong.stackandqueue;

import java.util.Stack;

public class Solution1047 {


    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }else stack.push(c);
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        result.reverse();
        return result.toString();

    }


}