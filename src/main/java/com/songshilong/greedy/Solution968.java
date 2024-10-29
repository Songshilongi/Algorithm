package com.songshilong.greedy;


/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-29  20:01
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution968 {
    int result = 0;

    public int minCameraCover(TreeNode root) {
        if (minCamera(root) == 0) {
            result++;
        }
        return result;
    }

    public int minCamera(TreeNode node) {
        if (node == null) {
            return 2;
        }
        int left = minCamera(node.left);
        int right = minCamera(node.right);
        /*
        0 - 无覆盖
        1 - 摄像头
        2 - 有覆盖
         */
        if (left == 2 && right == 2) {
            return 0;
        } else if (left == 0 || right == 0) {
            result++;
            return 1;
        } else {
            // (1, 1) (1, 2) (2, 1)
            return 2;
        }
    }
}
