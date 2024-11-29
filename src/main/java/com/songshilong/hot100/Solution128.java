package com.songshilong.hot100;

import java.util.*;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-11-29  15:00
 * @Description: 128. 最长连续序列
 * @Version: 1.0
 */
public class Solution128 {

    public int longestConsecutive(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (Integer number : set) {
            // contains number - 1 then continue
            if (set.contains(number - 1)) {
                continue;
            }
            int len = 0;
            int num = number;
            while (set.contains(num)) {
                len++;
                num++;
            }
            answer = Math.max(answer, len);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        Solution128 solution128 = new Solution128();
        System.out.println(solution128.longestConsecutive(nums));
    }



}
