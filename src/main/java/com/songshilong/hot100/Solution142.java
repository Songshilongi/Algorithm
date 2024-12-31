package com.songshilong.hot100;

import com.songshilong.linkedList.ListNode;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-31  16:42
 * @Description: 142. 环形链表 II
 * @Version: 1.0
 */
public class Solution142 {



    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode you  = fast;
                ListNode she = head;
                while (you != she) {
                    you = you.next;
                    she = she.next;
                }
                return you;
            }
        }
        return null;
    }
}
