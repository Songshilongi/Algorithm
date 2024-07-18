package com.songshilong.linkedList;

public class Solution203 {


    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode currentNode = head;
        ListNode preNode = dummy;
        while (currentNode != null) {
            if (currentNode.val == val) {
                preNode.next = currentNode.next;
            }else {
                preNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        return dummy.next;
    }


}
