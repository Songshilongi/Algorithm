package com.songshilong.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution700 {


    /**
     * 解法1 层序遍历
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.val == val) {
                    return node;
                }
                size--;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return null;
    }


    /**
     * 解法2.利用二叉搜索树的性质
     */
    public TreeNode searchBST2(TreeNode root, int val) {
        return travelFind(root, val);
    }

    public TreeNode travelFind(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val > val) {
            return travelFind(root.left, val);
        }
        return travelFind(root.right, val);
    }


}
