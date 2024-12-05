package com.songshilong.hot100;

import com.songshilong.linkedList.ListNode;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Song shi long
 * @CreateTime: 2024-12-05  18:20
 * @Description: 反转链表
 * @Version: 1.0
 */
public class Solution206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode next = null;
        ListNode current = head;
        while (current.next != null){
            ListNode temp = current.next;
            current.next = next;
            next = current;
            current = temp;
        }
        current.next = next;
        return current;
    }
}
