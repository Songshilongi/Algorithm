package com.songshilong.hot100;

import com.songshilong.linkedList.ListNode;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2025-01-16  15:32
 * @Description: 25. K 个一组翻转链表
 * @Version: 1.0
 */
public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode start = dummy;
        while (true) {
            ListNode end = start;
            boolean valid = true;
            for (int i = 0; i < k; i++) {
                if (end.next == null) {
                    valid = false;
                    continue;
                }
                end = end.next;
            }
            if (valid) {
                ListNode temp = start.next;
                start.next = this.reverse(temp, end, end.next);
                start = temp;
            } else {
                break;
            }
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode start, ListNode end, ListNode release) {
        ListNode currentNode = start;
        ListNode preNode = release;
        while (currentNode != end) {
            ListNode temp = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = temp;
        }
        end.next = preNode;
        return end;
    }
}
