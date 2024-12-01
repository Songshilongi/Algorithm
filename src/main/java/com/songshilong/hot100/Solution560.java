package com.songshilong.hot100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-12-01  12:22
 * @Description: 560. 和为 K 的子数组
 * @Version: 1.0
 */
public class Solution560 {


    public int subarraySum(int[] nums, int k) {
        int answer = 0;
        // map 记录某个和出现的次数 默认0出现了1次
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
            if (map.containsKey(sum - k)) {
                answer = answer + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return answer;
    }
}
