package com.company.swordOffer.sword00013;

import com.company.bean.ListNode;

import java.util.Stack;

/**
 * 链表中倒数第K个结点
 * <p>
 * 1. 利用Stack获取K个节点
 * <p>
 * 2. 利用前后指针获取K个节点
 * <p>
 * 注意K的越界问题
 */
public class FindReverseKNode {

    public ListNode find(ListNode node, int K) {
        if (K == 0) {
            return null;
        }
        int count = 0;
        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            count++;
            node = node.next;
        }
        if (K > count) {
            return null;
        }
        for (int i = 1; i < K; i++) {
            stack.pop();
        }
        return stack.pop();
    }

    public ListNode findFast(ListNode node, int K) {
        if (K == 0) {
            return null;
        }
        ListNode pre = node;
        for (int i = 0; i < K - 1; i++) {
            if(pre.next != null) {
                pre = pre.next;
            }else{
                return null;
            }
        }
        while (pre.next != null) {
            node = node.next;
            pre = pre.next;
        }
        return node;
    }

    public static void main(String[] args) {
        FindReverseKNode findReverseKNode = new FindReverseKNode();
        ListNode head = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        ListNode node = findReverseKNode.find(head, 2);
        ListNode node1 = findReverseKNode.findFast(head, 5);
        System.out.println(node.value);
        System.out.println(node1.value);
    }
}
