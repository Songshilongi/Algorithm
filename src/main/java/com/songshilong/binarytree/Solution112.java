package com.songshilong.binarytree;

public class Solution112 {


    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return rollBack(root, targetSum, 0);
    }

    public boolean rollBack(TreeNode root, int targetSum, int sum){
        if (root == null){
            return false;
        }
        sum = sum + root.val;
        if (sum == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return rollBack(root.left, targetSum, sum) || rollBack(root.right, targetSum, sum);
    }

}
