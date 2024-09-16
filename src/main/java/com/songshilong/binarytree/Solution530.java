package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.List;

public class Solution530 {


    public int getMinimumDifference(TreeNode root) {
        List<Integer> valueList = new ArrayList<>();
        innerTraversal(root, valueList);
        // 二叉搜索树中序遍历的结果是升序的
        // 在升序的列表里面找最小差值
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < valueList.size(); i++) {
            result = Math.min(valueList.get(i) - valueList.get(i - 1), result);
        }
        return result;


    }


    /**
     * 二叉搜索树的中序遍历是升序的
     *
     * @param root      根节点
     * @param valueList 存放结果的列表
     */
    public void innerTraversal(TreeNode root, List<Integer> valueList) {
        if (root == null) {
            return;
        }
        innerTraversal(root.left, valueList);
        valueList.add(root.val);
        innerTraversal(root.right, valueList);
    }


}
