package com.songshilong.binarytree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Solution404 {


    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int result = 0;
        Queue<Object> queue = new LinkedList<>();
        // 0: root, 1: left, 2:right
        queue.add(root);
        queue.add(0);
        while (!queue.isEmpty()) {
            TreeNode node = (TreeNode) queue.poll();
            int type = (int) queue.poll();
            if (type == 1 && node.left == null && node.right == null) {
                result = result + node.val;
            }
            if (node.left != null) {
                queue.add(node.left);
                queue.add(1);
            }
            if (node.right != null) {
                queue.add(node.right);
                queue.add(2);
            }
        }
        return result;
    }


}
