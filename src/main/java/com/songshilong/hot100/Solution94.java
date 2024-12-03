package com.songshilong.hot100;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-12-03  17:45
 * @Description: 94. 二叉树的中序遍历
 * @Version: 1.0
 */
public class Solution94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        this.rollBack(root, result);
        return result;
    }
    public void rollBack(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        rollBack(root.left, result);
        result.add(root.val);
        rollBack(root.right, result);
    }


}
