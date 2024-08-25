package com.songshilong.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution104 {


    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            while (size > 0) {
                TreeNode node = queue.poll();
                size--;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return depth;
    }




}
