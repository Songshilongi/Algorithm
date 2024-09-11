package com.songshilong.binarytree;

import java.util.HashMap;
import java.util.Map;

public class Solution106 {

    Map<Integer, Integer> inorderMappingMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMappingMap.put(inorder[i], i);
        }
        return buildTreeIteration(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    /**
     * @param inorder        中序遍历的结果数组
     * @param postorder      后序遍历的结果数组
     * @param inorderStart   中序遍历起始索引
     * @param inorderEnd     中序遍历终止索引
     * @param postorderStart 后续遍历起始索引
     * @param postOrderEnd   后续遍历终止索引
     * @return TreeNode root
     */
    public TreeNode buildTreeIteration(int[] inorder, int[] postorder, int inorderStart, int inorderEnd, int postorderStart, int postOrderEnd) {
        if (inorderStart > inorderEnd|| postorderStart > postOrderEnd) {
            return null;
        }
        TreeNode node = new TreeNode(postorder[postOrderEnd]);
        Integer inorderRootIndex = inorderMappingMap.get(postorder[postOrderEnd]);
        node.left = buildTreeIteration(inorder, postorder, inorderStart, inorderRootIndex - 1, postorderStart, postorderStart + inorderRootIndex - inorderStart - 1);
        node.right = buildTreeIteration(inorder, postorder, inorderRootIndex + 1, inorderEnd, postorderStart + inorderRootIndex - inorderStart, postOrderEnd - 1);
        return node;
    }



}
