package com.songshilong.binarytree;
import java.util.*;
public class Solution107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size;
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                size--;
                temp.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(temp);
        }
        Collections.reverse(result);
        return result;
    }





}
