package com.company.leetcode;

import com.company.bean.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class _21 {

    public static void main(String[] args) {
        ListNode l10 = new ListNode(-9);
        ListNode l11 = new ListNode(3);
//        ListNode l12 = new ListNode(4);
        l10.next = l11;
//        l11.next = l12;

        ListNode l20 = new ListNode(5);
        ListNode l21 = new ListNode(7);
//        ListNode l22 = new ListNode(4);
        l20.next = l21;
//        l21.next = l22;

        ListNode listNode = mergeTwoLists(l10, l20);
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(listNode.val);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode left = l1;
        ListNode right = l2;
        if (l1.val > l2.val) {
            left = l2;
            right = l1;
        }

        while (right != null) {
            while (left.val < right.val && left.next != null && left.next.val < right.val) {
                left = left.next;
            }
            ListNode temp = right.next;
            right.next = left.next;
            left.next = right;
            left = right;
            right = temp;
        }
        if (l1.val > l2.val) {
            return l2;
        }
        return l1;
    }
}
