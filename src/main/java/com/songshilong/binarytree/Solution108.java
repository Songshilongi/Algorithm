package com.songshilong.binarytree;

public class Solution108 {


    /**
     * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵平衡二叉搜索树。
     *
     * @param nums 给定的整数数组
     * @return 平衡二叉搜索树的根节点
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return rollBack(nums, 0, nums.length - 1);
    }

    public TreeNode rollBack(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = rollBack(nums, start, mid - 1);
        node.right = rollBack(nums, mid + 1, end);
        return node;
    }


}
