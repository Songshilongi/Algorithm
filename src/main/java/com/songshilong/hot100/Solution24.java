package com.songshilong.hot100;

import com.songshilong.linkedList.ListNode;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2025-01-16  15:15
 * @Description: 24. 两两交换链表中的节点
 * @Version: 1.0
 */
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode currentNode = dummy;
        while (currentNode.next != null && currentNode.next.next != null) {

            ListNode temp = currentNode.next.next.next;
            ListNode first = currentNode.next;
            ListNode second = currentNode.next.next;
            second.next = first;
            first.next = temp;
            currentNode.next = second;
         currentNode = currentNode.next.next;
        }
        return dummy.next;
    }
}
