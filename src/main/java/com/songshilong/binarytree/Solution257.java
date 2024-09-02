package com.songshilong.binarytree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return null;
        List<String> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        rollBack(root, result, temp);
        return result;

    }
    public void rollBack(TreeNode root, List<String> result, List<String> temp){
        if (root == null){
            return;
        }
        temp.add(String.valueOf(root.val));
        if (root.left == null && root.right == null){
            result.add(String.join("->", temp));
        }
        rollBack(root.left,result, temp);
        rollBack(root.right,result, temp);
        temp.removeLast();
    }

}
