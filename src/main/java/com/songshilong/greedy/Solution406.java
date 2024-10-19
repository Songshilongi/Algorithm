package com.songshilong.greedy;

import java.io.Serial;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-19  16:34
 * @Description: 406. 根据身高重建队列
 * @Version: 1.0
 */

public class Solution406 {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(item1, item2) -> {
            if (item1[0] == item2[0]) {
                return item1[1] - item2[1];
            }
            return -(item1[0] -item2[0]);
        });
        LinkedList<int[]> result = new LinkedList<>();
        for (int[] person : people) {
            result.add(person[1], person);
        }
        return result.toArray(new int[people.length][]);
    }
}
