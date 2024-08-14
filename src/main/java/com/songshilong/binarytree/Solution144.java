package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution144 {


    /**
     * 递归法
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        back(root, result);
        return result;
    }

    public void back(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        TreeNode left = root.left;
        TreeNode right = root.right;
        back(left, result);
        back(right, result);
    }


    /**
     * 迭代法
     */
    public List<Integer> preorderTraversalIteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }


}
