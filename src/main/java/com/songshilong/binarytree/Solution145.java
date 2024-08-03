package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.List;

public class Solution145 {

    /**
     * 145. 二叉树的后序遍历--迭代法
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        back(root, result);
        return result;
    }

    public void back(TreeNode root, List<Integer> result) {
        if (root == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        back(left, result);
        back(right, result);
        result.add(root.val);
    }


}
