package com.songshilong.dynamic;

import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.dynamic
 * @Author: Song shi long
 * @CreateTime: 2024-11-07  21:38
 * @Description: 139. 单词拆分
 * @Version: 1.0
 */
public class Solution39 {


    public boolean wordBreak(String s, List<String> wordDict) {

        int kind = wordDict.size();
        // dp 表示在容量为j的情况下，是否能够组成str
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int j = 1; j < s.length() + 1; j++) {
            for (String word : wordDict) {
                int cost = word.length();
                if (j - cost >= 0 && dp[j - cost] && word.equals(s.substring(j - cost, j))) {
                    dp[j] = true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
}
