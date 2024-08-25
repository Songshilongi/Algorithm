package com.songshilong.binarytree;

import java.lang.annotation.RetentionPolicy;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution515 {


    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;
        int count = 0;
        int temp = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            if (size == 0) {
                size = count;
                count = 0;
                result.add(temp);
                temp = Integer.MIN_VALUE;
            }
            TreeNode node = queue.poll();
            temp = Math.max(temp, node.val);
            size--;
            if (node.left != null) {
                queue.add(node.left);
                count++;
            }
            if (node.right != null) {
                queue.add(node.right);
                count++;
            }
        }
        result.add(temp);
        return result;
    }



}
