package com.songshilong.binarytree;

public class Solution235 {


    /**
     * 二叉搜索树的最近公共祖先
     * 二叉搜索树的左节点值<根节点值<右节点值，最近公共祖先一定在区间[p, q]之间
     * @param root 给定的根节点
     * @param p    第一个子节点
     * @param q    第二个子节点
     * @return 公共祖先节点
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }


}
