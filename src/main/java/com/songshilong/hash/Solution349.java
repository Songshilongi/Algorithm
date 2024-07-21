package com.songshilong.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer num : set1) {
            if (set2.contains(num)) list.add(num);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();


    }


}
