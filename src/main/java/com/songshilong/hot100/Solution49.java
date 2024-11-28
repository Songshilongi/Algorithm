package com.songshilong.hot100;

import com.songshilong.monotonestack.Solution496;

import java.util.*;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-11-28  17:59
 * @Description: 49. 字母异位词分组
 * @Version: 1.0
 */
public class Solution49 {


    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String string = Arrays.toString(chars);
            if (map.containsKey(string)) {
                map.get(string).add(str);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(string, list);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        Solution49 solution49 = new Solution49();
        System.out.println(solution49.groupAnagrams(strs));
    }



}
