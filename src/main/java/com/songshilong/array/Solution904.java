package com.songshilong.array;

import java.util.HashMap;
import java.util.Map;

public class Solution904 {


    public int totalFruit(int[] fruits) {
        int len = fruits.length;
        int left = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < len; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) -1 );
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            result = Math.max(result, right - left + 1);


        }
        return result;
    }






}
