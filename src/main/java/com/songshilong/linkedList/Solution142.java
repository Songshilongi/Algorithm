package com.songshilong.linkedList;

public class Solution142 {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // slow step 1
            fast = fast.next.next; // fast step 2
            // 存在circle
            if (slow == fast) {
                ListNode index1 = head;
                ListNode index2 = slow;
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }

        return null;

    }

    /*
    slow step = 1 -- fast step = 2
    slow 走过的步数是 a + b
    fast 走过的步数是 a + b + (b + c) * n
    n = 1 的时候，
    a + b + b + c = 2 (a + b) --> a = c
     */


}
