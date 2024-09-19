package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.List;

public class Solution236 {


    /**
     * 寻找二叉树的两个节点的公共祖先
     * <p>由于题目中节点的值都不相同，并且一定会有结果，所以在左右子树中一定可以找到结果，可能分布在两侧也可能只在一侧</p>
     * @param root 给定二叉树的根节点
     * @param p 第一个需要寻找的节点
     * @param q 第二个需要寻找的节点
     * @return 公共祖先节点
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null) {
            return null;
        } else if (left != null && right == null) {
            return left;
        } else if (left == null && right != null) {
            return right;
        } else {
            return root;
        }


    }


}
