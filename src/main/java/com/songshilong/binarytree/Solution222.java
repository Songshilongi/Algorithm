package com.songshilong.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution222 {

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.right == null && root.left == null) return 1;
        return countNodes(root.left) + countNodes(root.right);
    }


}
