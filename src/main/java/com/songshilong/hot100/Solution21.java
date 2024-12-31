package com.songshilong.hot100;

import com.songshilong.linkedList.ListNode;

import java.lang.invoke.CallSite;
import java.time.temporal.ValueRange;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-31  17:05
 * @Description: 21. 合并两个有序链表
 * @Version: 1.0
 */
public class Solution21 {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

}
