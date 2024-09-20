package com.songshilong.binarytree;


public class Solution701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        process(root, val);
        return root;
    }

    public void process(TreeNode node, int val) {
        if (val > node.val && node.right != null) {
            process(node.right, val);
        }else if (val > node.val && node.right == null) {
            node.right = new TreeNode(val);
        }else if (val < node.val && node.left != null) {
            process(node.left, val);
        }else if (val < node.val && node.left == null) {
            node.left = new TreeNode(val);
        }
    }

}
