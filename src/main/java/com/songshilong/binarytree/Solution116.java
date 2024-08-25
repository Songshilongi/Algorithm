package com.songshilong.binarytree;

import com.songshilong.binarytree.node.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Solution116 {

    public Node connect(Node root) {
        if (root == null) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;
        int count = 0;
        Node node = null;
        while (!queue.isEmpty()) {
            if (size == 0) {
                size = count;
                count = 0;
                node.next = null;
            }
            node = queue.poll();
            if (size > 1) {
                node.next = queue.peek();
            }
            size--;
            if (node.left != null) {
                queue.add(node.left);
                count++;
            }
            if (node.right != null) {
                queue.add(node.right);
                count++;
            }
        }
        return root;
    }

}
