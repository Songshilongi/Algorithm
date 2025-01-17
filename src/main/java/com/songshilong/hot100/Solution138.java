package com.songshilong.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: com.songshilong.hot100
 * @Author: Shilong Song
 * @CreateTime: 2025-01-17  16:27
 * @Description: 138. 随机链表的复制
 * @Version: 1.0
 */
public class Solution138 {
    // 记录复制过的节点
    Map<Node, Node> cache = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        if (!cache.containsKey(head)) {
            Node node  = new Node(head.val);
            cache.put(head, node);
            node.next = copyRandomList(head.next);
            node.random = copyRandomList(head.random);
        }
        return cache.get(head);
    }
}
