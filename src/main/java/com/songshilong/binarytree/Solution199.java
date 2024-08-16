package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;
        int count = 0;
        result.add(root.val);
        while (!queue.isEmpty()) {
            if (size == 0) {
                size = count;
                count = 0;
                TreeNode element = queue.element();
                result.add(element.val);
            }
            TreeNode node = queue.poll();
            size--;

            if (node.right != null) {
                queue.add(node.right);
                count++;
            }
            if (node.left != null) {
                queue.add(node.left);
                count++;
            }
        }
        return result;
    }
}
