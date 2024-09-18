package com.songshilong.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution501 {


    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        innerOrder(root, list);
        if (list.size() == 1) {
            return new int[]{root.val};
        }
        // 二叉搜索树中序遍历的结果是升序
        List<Integer> result = new ArrayList<>();
        int preNumber = list.get(0);
        int maxCount = 1;
        int currentCount = 1;
        result.add(preNumber);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == preNumber) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount == maxCount) {
                result.add(list.get(i));
            }else if (currentCount > maxCount) {
                maxCount = currentCount;
                result.clear();
                result.add(list.get(i));
            }

            preNumber = list.get(i);

        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }


    public void innerOrder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        innerOrder(node.left, list);
        list.add(node.val);
        innerOrder(node.right, list);
    }
}
