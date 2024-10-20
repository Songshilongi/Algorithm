package com.songshilong.greedy;

import com.sun.tools.javac.Main;

import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.greedy
 * @Author: Song shi long
 * @CreateTime: 2024-10-20  13:58
 * @Description: 452. 用最少数量的箭引爆气球
 * @Version: 1.0
 */
public class Solution452 {


    public int findMinArrowShots(int[][] points) {

        // 按照升序排序元素, 存在溢出
//        Arrays.sort(points, (item1, item2) -> {
//            if (item1[0] == item2[0]) {
//                return item1[1] - item2[1];
//            }
//            return item1[0] - item2[0];
//        });
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int result = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {  // 气球i和气球i-1不挨着，注意这里不是>=
                result++; // 需要一支箭
            } else {  // 气球i和气球i-1挨着
                points[i][1] = Math.min(points[i][1], points[i - 1][1]); // 更新重叠气球最小右边界
            }
        }
        return result;
    }

}
