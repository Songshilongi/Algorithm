package com.songshilong.stackandqueue;

import java.util.*;

public class Solution347 {
    /*
    给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
     */
    public int[] topKFrequent(int[] nums, int k) {
        // 1.先统计每个数组出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 2.再去找出现次数前k个的
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return -(o1[1] - o2[1]);
            }
        });
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = priorityQueue.poll()[0];
        return result;
    }


}
