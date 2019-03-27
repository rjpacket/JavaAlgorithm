package com.company.leetcode.before;

import com.company.bean.ListNode;

public class _237 {

    public static void main(String[] args) {

    }

    public static void deleteNode(ListNode node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }
}
