package com.company.swordOffer.sword00014;

import com.company.bean.ListNode;
import com.company.bean.NodeUtils;

/**
 * 反转单链表
 * <p>
 * 1. 利用一个null节点交换指向
 * <p>
 * 2. 递归实现
 */
public class ReverseNode {

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = pre;
            pre = temp;

        }
        return pre;
    }

    /**
     * 递归反转  烧脑级别
     *
     * @param head
     * @return
     */
    public ListNode reverseRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newList = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newList;
    }

    /**
     * 正常级别
     *
     * @param pre
     * @param head
     * @return
     */
    public ListNode normalReverse(ListNode pre, ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head.next = pre;
            return head;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = pre;
        return normalReverse(temp, head);
    }

    public static void main(String[] args) {
        ReverseNode reverseNode = new ReverseNode();
        ListNode head = NodeUtils.buildNodes(new int[]{1, 2, 3, 4, 5});
//        ListNode newHead = reverseNode.reverse(head);
//        ListNode newHead = reverseNode.reverseRecursion(head);
        ListNode newHead = reverseNode.normalReverse(null, head);
        NodeUtils.printNode(newHead);
    }
}
