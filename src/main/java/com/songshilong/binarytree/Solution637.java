package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution637 {


    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;
        int count = 0;
        double sum = 0;
        int discount = size;
        while (!queue.isEmpty()) {
            if (size == 0) {
                result.add(sum / discount);
                size = count;
                discount = size;
                count = 0;
                sum = 0;
            }
            TreeNode node = queue.poll();
            size--;
            sum = sum + node.val;
            if (node.right != null) {
                queue.add(node.right);
                count++;
            }
            if (node.left != null) {
                queue.add(node.left);
                count++;
            }
        }
        result.add(sum / discount);
        return result;
    }


}
