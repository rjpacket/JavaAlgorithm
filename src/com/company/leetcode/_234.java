package com.company.leetcode;

import com.company.bean.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class _234 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(-129);
        ListNode n2 = new ListNode(-129);
//        ListNode n3 = new ListNode(4);
//        ListNode n4 = new ListNode(4);
//        ListNode n5 = new ListNode(1);
        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
        System.out.println(isPalindrome(n1));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size() / 2;
        for (int i = 0; i < size; i++) {
            if (!list.get(i).equals(list.get(list.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
