package com.songshilong.linkedList;

public class Solution206 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;  // 临时保存下一个节点
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }


}
