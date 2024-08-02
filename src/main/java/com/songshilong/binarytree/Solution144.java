package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.List;

public class Solution144 {


    /**
     * 迭代法
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











}
