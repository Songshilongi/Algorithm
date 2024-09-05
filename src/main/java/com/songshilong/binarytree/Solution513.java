package com.songshilong.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int result = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            result = queue.peek().val;
            while (size > 0) {
                TreeNode node = queue.poll();
                size--;
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return result;
    }
}
