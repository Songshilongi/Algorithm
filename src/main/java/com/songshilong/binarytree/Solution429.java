package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.zip.CheckedInputStream;

public class Solution429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int size;

        while (!queue.isEmpty()) {
            size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0) {
                Node node = queue.poll();
                size--;
                list.add(node.val);
                List<Node> children = node.children;
                if (children != null) {
                    for (Node child : children) {
                        queue.add(child);
                    }
                }
                if (size == 0) result.add(list);
            }
        }
        return result;
    }
}
