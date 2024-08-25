package com.songshilong.binarytree;

import com.songshilong.binarytree.node.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Solution117 {

    public Node connect(Node root) {
        if (root == null) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;
        int count = 0;
        Node current = null;
        while (!queue.isEmpty()) {
            if (size == 0) {
                size = count;
                count = 0;
                current.next = null;
            }

            current = queue.poll();
            if (size > 1) current.next = queue.peek();
            size--;

            if (current.left != null) {
                queue.add(current.left);
                count++;
            }
            if (current.right != null) {
                queue.add(current.right);
                count++;
            }

        }
        return root;
    }

}
