package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution538 {


    /**
     * 给出二叉 搜索 树的根节点，该树的节点值各不相同，请你将其转换为累加树（Greater Sum Tree），使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。<br>
     * 提醒一下，二叉搜索树满足下列约束条件：<br>
     * 1. 节点的左子树仅包含键 小于 节点键的节点。<br>
     * 2. 节点的右子树仅包含键 大于 节点键的节点。<br>
     * 3. 左右子树也必须是二叉搜索树。<br>
     *
     * @param root 给定二叉树的根节点
     * @return 转换成累加树后的根节点
     */
    public TreeNode convertBST1(TreeNode root) {
        if (root == null) return null;
        List<Integer> list = new ArrayList<>();
        innerOrder(root, list);
        int sum = 0;
        for (Integer i : list) {
            sum = sum + i;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : list) {
            map.put(num, sum);
            sum = sum - num;
        }
        update(root, map);
        return root;
    }


    /**
     * 二叉搜索树中序遍历的结果是升序的
     *
     * @param node 给定二叉搜索树的根节点
     * @param list 存放结果的数组
     */
    public void innerOrder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        innerOrder(node.left, list);
        list.add(node.val);
        innerOrder(node.right, list);
    }

    public void update(TreeNode node, Map<Integer, Integer> map) {
        if (node == null) return;
        node.val = map.get(node.val);
        update(node.left, map);
        update(node.right, map);
    }


    int sum = 0;
    /**
     * Method 2
     */
    public TreeNode convertBST(TreeNode root) {
        return update(root);
    }
    public TreeNode update(TreeNode node) {
        if (node == null) return null;
        update(node.right);
        node.val = node.val + sum;
        sum = node.val;
        update(node.left);
        return node;
    }


}
