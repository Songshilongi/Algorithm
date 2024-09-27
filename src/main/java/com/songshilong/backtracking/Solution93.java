package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 93. 复原 IP 地址
 */
public class Solution93 {
    List<String> result = new ArrayList<>();
    List<String> temp = new ArrayList<>();
    int dotNumber = 4;

    public List<String> restoreIpAddresses(String s) {
        // 不足四个肯定构不成IP地址
        if (s.length() < 4) {
            return result;
        }
        backTracking(s, 0);
        return result;
    }

    private void backTracking(String s, int start) {
        if (dotNumber == 0) {
            result.add(String.join(".", temp));
            return;
        }
        for (int i = 1; i <= 3; i++) {
            int end = start + i;
            if (end > s.length()) continue;
            String sub = s.substring(start, end);
            if (sub.startsWith("0") && sub.length() != 1) continue;

            dotNumber--;
            int remainLength = s.length() - end;
            if (Integer.parseInt(sub) > 255 || remainLength > dotNumber * 3) {
                dotNumber++;
                continue;
            }
            // 有效
            temp.add(sub);
            backTracking(s, end);
            temp.removeLast();
            dotNumber++;
        }
    }


}
