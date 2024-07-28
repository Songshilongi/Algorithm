package com.songshilong.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.offer(x);
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
        Queue<Integer> temp;
        temp = queue2;
        queue2 = queue1;
        queue1 = temp;
    }

    public int pop() {
        return queue2.poll();
    }

    public int top() {
        return queue2.peek();

    }

    public boolean empty() {
        return queue2.isEmpty();
    }


}
