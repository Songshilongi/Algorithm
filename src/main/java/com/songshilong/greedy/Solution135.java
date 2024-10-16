package com.songshilong.greedy;

import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-16  20:34
 * @Description: 分发糖果
 * @Version: 1.0
 */
public class Solution135 {

    public int candy(int[] ratings) {
        int[] result = new int[ratings.length];
        Arrays.fill(result, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                result[i] = result[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                if (result[i + 1] >= result[i]) {
                    result[i] = result[i + 1] + 1;
                }
            }

        }
        int sum = 0;
        for (int num : result) {
            sum += num;
        }
        return sum;


    }




}
