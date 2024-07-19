package com.songshilong.linkedList;

import java.security.DrbgParameters;

public class Solution19 {


    // 解法1：反转两次链表

    /*
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 删除倒数第N个节点，先把整个反过来，然后再正着删除就可以了
        // 反转链表
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        // 反转后的链表在pre里面
        ListNode dummy = new ListNode();
        dummy.next = pre;
        cur = dummy;
        pre = null;
        for (int i = n; i > 0; i--) {
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
        // 再反回来
        pre = null;
        cur = dummy.next;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
     */

    // 解法2：双指针法
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for (int i = n; i > 0; i--) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }


}
