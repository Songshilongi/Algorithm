package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.List;

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


}
