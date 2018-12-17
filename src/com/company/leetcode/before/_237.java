package com.company.leetcode.before;

import com.company.bean.ListNode;

import java.util.Iterator;

public class _237 {

    public static void main(String[] args) {

    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
