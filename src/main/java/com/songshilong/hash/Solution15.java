package com.songshilong.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // a + b + c = 0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return result;
            // 对 a 去重
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (right > left) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else { // a + b + c = 0
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 对 b 和 c去重
                    while (right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left + 1] == nums[left]) left++;
                    left++;
                    right--;
                }
            }
        }
        return result;
    }


}
