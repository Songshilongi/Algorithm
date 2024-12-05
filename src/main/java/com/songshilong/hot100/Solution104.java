package com.songshilong.hot100;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-12-05  17:57
 * @Description: 104. 二叉树的最大深度
 * @Version: 1.0
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        int sum = 1;
        int count = 0;
        int depth = 1;
        while (!deque.isEmpty()) {
            if (sum == 0) {
                sum = count;
                count = 0;
                depth++;
            }
            TreeNode node = deque.removeFirst();
            sum--;
            if (node.right != null) {
                deque.addLast(node.right);
                count++;
            }
            if (node.left != null) {
                deque.addLast(node.left);
                count++;
            }
        }
        return depth;
    }


    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth2(root.left);
        int right = maxDepth2(root.right);
        return Math.max(left, right) + 1;
    }
}
