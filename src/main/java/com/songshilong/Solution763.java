package com.songshilong;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong
 * @Author: Song shi long
 * @CreateTime: 2024-10-22  21:54
 * @Description: 763. 划分字母区间
 * @Version: 1.0
 */
public class Solution763 {

    public List<Integer> partitionLabels(String s) {
        // 先找到每个字母最后出现的位置的下表
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(last[s.charAt(i) - 'a'], end);
            if (end == i) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }
        return result;
    }
}
