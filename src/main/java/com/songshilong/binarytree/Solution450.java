package com.songshilong.binarytree;

public class Solution450 {


    /**
     * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。<br>
     *
     * @param root 给定二叉树的根节点
     * @param key  需要删除的节点值
     * @return 删除后的二叉树的根节点
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.right == null && root.left == null) return null;
            if (root.right == null) return root.left;
            if (root.left == null) return root.right;
            TreeNode temp = root.right;
            while (temp.left != null) temp = temp.left;
            temp.left = root.left;
            root = root.right;
            return root;
        }
        if (root.val > key) root.left = deleteNode(root.left, key);
        if (root.val < key) root.right = deleteNode(root.right, key);
        return root;
    }

}
