package com.songshilong.hot100;

import com.songshilong.linkedList.ListNode;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-31  17:30
 * @Description: 2. 两数相加
 * @Version: 1.0
 */
public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int more = 0;
        while (l1 != null || l2 != null || more != 0) {
            int number1 = 0;
            if (l1 != null) {
                number1 = l1.val;
                l1 = l1.next;
            }
            int number2 = 0;
            if (l2 != null) {
                number2 = l2.val;
                l2 = l2.next;
            }
            int sum = number1 + number2 + more;
            int res = sum % 10;
            more = sum / 10;
            if (head == null) {
                head = new ListNode(res);
                tail = head;
            } else {
                tail.next = new ListNode(res);
                tail = tail.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.addTwoNumbers(l1, l2));

    }

}
