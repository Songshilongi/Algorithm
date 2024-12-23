package com.songshilong.hot100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-23  17:28
 * @Description: 41. 缺失的第一个正数
 * @Version: 1.0
 */
public class Solution41 {

    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num <= 0) {
                continue;
            }
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (set.contains(i)) {
                continue;
            }
            return i;
        }
        return nums.length + 1;
    }
}
