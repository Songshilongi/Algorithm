package com.songshilong.hot100;

import com.songshilong.linkedList.ListNode;

import javax.swing.plaf.RootPaneUI;
import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2024-12-31  16:18
 * @Description: 234. 回文链表
 * @Version: 1.0
 */
public class Solution234 {


    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
