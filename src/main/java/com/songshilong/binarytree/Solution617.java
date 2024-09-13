package com.songshilong.binarytree;

public class Solution617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return buildTree(root1, root2);
    }

    public TreeNode buildTree(TreeNode node1, TreeNode node2 ) {
        if (node1 == null && node2 == null) {
            return null;
        }
        if (node1 == null) {
            return node2;
        }
        if (node2 == null){
            return node1;
        }
        TreeNode node = new TreeNode(node1.val + node2.val);
        node.left = buildTree(node1.left, node2.left);
        node.right = buildTree(node1.right, node2.right);
        return node;
    }





}
