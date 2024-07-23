package com.songshilong.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {


    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        // a + b + c + d = target
        for (int i = 0; i < len; i++) {

            if (nums[i] > 0 && nums[i] > target) return result;
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 对 a 去重

            for (int j = i + 1; j < len; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // 对 b 去重

                int left = j + 1;
                int right = len - 1;

                while (right > left) {
                    if (nums[i] + nums[j] + nums[left] + nums[right] > target) {
                        right--;
                    } else if (nums[i] + nums[j] + nums[left] + nums[right] < target) {
                        left++;
                    } else {
                        // a + b + c + d = target
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (right > left && nums[right] == nums[right - 1]) right--; // 对 d 去重
                        while (right > left && nums[left] == nums[left + 1]) left++; // 对 c 去重
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }


}
