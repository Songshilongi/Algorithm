package com.songshilong.linkedList;

public class Solution160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode A = headA;
        ListNode B = headB;
        while (A != B) {
            A = A!=null ? A.next : headB;
            B = B!= null? B.next : headA;
        }
        return A;
    }

    /*
    解题思路：假设链表A的长度是lenA，链表B的长度是lenB，
    那么无论是先从链表A出发遍历A再遍历B，还是先从B出发遍历B再遍历A，走过的长度都是lenA + lenB
    而当出现相同指针的时候，最后的长度是公共的长度c
    所以定义两个节点分别遍历自己的再遍历对方的，最后都会停止，c > 0就是存在相同的指针。 = 0 最后就是两边都遍历了一遍，最后也就是相同都是null了
     */






}
