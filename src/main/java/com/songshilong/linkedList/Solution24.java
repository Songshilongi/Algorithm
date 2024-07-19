package com.songshilong.linkedList;

import java.util.List;

public class Solution24 {


    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        ListNode temp = null;
        while (cur.next != null && cur.next.next != null){
            ListNode node1 = cur.next;
            ListNode node2 = cur.next.next;
            temp = node2.next;// cur -> node1 -> node2 -> temp
            cur.next = node2;
            cur.next.next = node1;
            node1.next =temp;// cur -> node2 -> node1 -> temp
            cur = node1;
        }
        return dummy.next;
    }


}
