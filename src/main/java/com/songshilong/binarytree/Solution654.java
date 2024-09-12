package com.songshilong.binarytree;

public class Solution654 {


    /**
     * 根据传入的数组构造最大二叉树
     * @param nums 二叉树数组
     * @return TreeNode
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    /**
     * 回溯
     * @param nums 数组
     * @param start 起始索引
     * @param end 终止索引
     * @return TreeNode
     */
    public TreeNode buildTree(int[] nums, int start, int end){
        if (start > end) {
            return null;
        }
        int maxValueIndex = start;
        for (int i = start; i <= end ; i++) {
            if (nums[i] > nums[maxValueIndex]) {
                maxValueIndex = i;
            }
        }
        TreeNode node = new TreeNode(nums[maxValueIndex]);
        node.left = buildTree(nums, start, maxValueIndex - 1);
        node.right = buildTree(nums, maxValueIndex + 1, end);
        return node;
    }
    

    
}
