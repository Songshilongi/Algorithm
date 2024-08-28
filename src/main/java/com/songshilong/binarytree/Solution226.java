package com.songshilong.binarytree;

public class Solution226 {

    public TreeNode invertTree(TreeNode root) {
        back(root);
        return root;
    }
    public void back(TreeNode root){
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        back(root.left);
        back(root.right);
    }


}
