package com.songshilong.hot100;

import com.songshilong.linkedList.ListNode;

import java.util.Objects;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-31  15:45
 * @Description: 160. 相交链表
 * @Version: 1.0
 */
public class Solution160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode you = headA, she = headB;
        while (you != she) {
            you = you == null ? headB : you.next;
            she = she == null ? headA : she.next;
        }
        return you;
    }
}
