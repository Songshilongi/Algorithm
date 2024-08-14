package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution94 {

    /**
     * 94. 二叉树的中序遍历--递归法
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        back(root, result);
        return result;
    }

    public void back(TreeNode root, List<Integer> result){
        if (root == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        back(left, result);
        result.add(root.val);
        back(right, result);
    }

    /**
     * 迭代法
     * @param root
     * @return
     */
    public List<Integer> inorderTraversalIteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node != null) {
                stack.pop();
                if (node.right != null) stack.push(node.right);
                stack.push(node);
                stack.push(null);
                if (node.left != null) stack.push(node.left);
            }else {
                stack.pop();
                node = stack.pop();
                result.add(node.val);
            }
        }
        return result;
    }


}
