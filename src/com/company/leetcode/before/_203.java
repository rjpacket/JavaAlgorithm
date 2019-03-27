package com.company.leetcode.before;

import com.company.bean.ListNode;

/**
 * 删除链表中等于给定值 value 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, value = 6
 * 输出: 1->2->3->4->5
 */
public class _203 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode listNode = removeElements(l1, 1);
        while (listNode != null) {
            System.out.println("----->" + listNode.value);
            listNode = listNode.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head != null && head.value == val) {
            head = head.next;
        }
        ListNode flag = head;
        while (head != null && head.next != null) {
            if (head.next.value == val) {
                ListNode right = head.next.next;
                head.next.next = null;
                head.next = right;
            } else {
                head = head.next;
            }
        }
        return flag;
    }
}
