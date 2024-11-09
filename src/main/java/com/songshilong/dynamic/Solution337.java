package com.songshilong.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-09  09:51
 * @Description: 337. 打家劫舍 III
 * @Version: 1.0
 */
public class Solution337 {

    public int rob(TreeNode root) {
        int[] inner = inner(root);
        return Math.max(inner[0], inner[1]);

    }

    private int[] inner(TreeNode node) {
        int[] result = new int[2];
        if (node == null) {
            return result;
        }
        int[] left = inner(node.left);
        int[] right = inner(node.right);
        // 当前节点不偷-偷左边最大(偷或者不偷)+偷右边（偷或者不偷）的最大
        result[0] = Math.max(left[0],left[1]) + Math.max(right[0], right[1]);
        // 当前节点偷，左右两边都不偷
        result[1] = node.val + left[0] + right[0];
        return result;
    }
}
