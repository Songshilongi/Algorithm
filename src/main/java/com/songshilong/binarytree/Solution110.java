package com.songshilong.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution110 {


    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return eval(root.left, root.right) && isBalanced(root.left) && isBalanced(root.right);
    }

    public boolean eval(TreeNode left, TreeNode right) {
        return getDepth(left) - getDepth(right) == 0 ||
                getDepth(left) - getDepth(right) == 1 ||
                getDepth(left) - getDepth(right) == -1 ||
                getDepth(right) - getDepth(left) == 1 ||
                getDepth(right) - getDepth(left) == -1;
    }


    public int getDepth(TreeNode root) {
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
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return depth;
    }


}
