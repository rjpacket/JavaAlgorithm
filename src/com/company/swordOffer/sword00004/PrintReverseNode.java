package com.company.swordOffer.sword00004;

import com.company.bean.ListNode;

import java.util.Stack;

/**
 * 倒序打印链表
 * <p>
 * 1.递归实现
 * <p>
 * 2.利用Stack的特性
 * 2.1 遍历node，依次压栈
 * 2.2 依次出栈
 */
public class PrintReverseNode {

    public void printNode(ListNode node) {
        if (node == null) {
            return;
        }
        printNode(node.next);
        System.out.println(node.value);
    }

    public void printNodeStack(ListNode node) {
        if (node == null) {
            return;
        }
        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        while (!stack.empty()) {
            ListNode pop = stack.pop();
            System.out.println(pop.value);
        }
    }

    public static void main(String[] args) {
        PrintReverseNode printReverseNode = new PrintReverseNode();
        ListNode node = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
//        printReverseNode.printNode(node);
        printReverseNode.printNodeStack(node);
    }
}
