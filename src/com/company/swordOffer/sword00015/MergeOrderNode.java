package com.company.swordOffer.sword00015;

import com.company.bean.ListNode;
import com.company.bean.NodeUtils;

/**
 * 合并两个排序的链表
 * <p>
 * 1. 遍历法
 * <p>
 * 2. 递归法
 */
public class MergeOrderNode {

    /**
     * 遍历的方法合并链表
     *
     * @param nodeA
     * @param nodeB
     * @return
     */
    public ListNode mergeNodes(ListNode nodeA, ListNode nodeB) {
        if (nodeA == null) {
            return nodeB;
        }
        if (nodeB == null) {
            return nodeA;
        }
        ListNode mergeNode = null;
        if (nodeA.value < nodeB.value) {
            mergeNode = nodeA;
            nodeA = nodeA.next;
        } else {
            mergeNode = nodeB;
            nodeB = nodeB.next;
        }
        ListNode temp = mergeNode;
        while (nodeA != null && nodeB != null) {
            if (nodeA.value < nodeB.value) {
                mergeNode.next = nodeA;
                mergeNode = mergeNode.next;
                nodeA = nodeA.next;
            } else {
                mergeNode.next = nodeB;
                mergeNode = mergeNode.next;
                nodeB = nodeB.next;
            }
        }
        while (nodeA != null) {
            mergeNode.next = nodeA;
            mergeNode = mergeNode.next;
            nodeA = nodeA.next;
        }
        while (nodeB != null) {
            mergeNode.next = nodeB;
            mergeNode = mergeNode.next;
            nodeB = nodeB.next;
        }
        return temp;
    }

    public ListNode mergeRecursion(ListNode nodeA, ListNode nodeB) {
        if (nodeA == null) {
            return nodeB;
        }
        if (nodeB == null) {
            return nodeA;
        }
        ListNode head = null;
        if (nodeA.value < nodeB.value) {
            head = nodeA;
            head.next = mergeRecursion(nodeA.next, nodeB);
        } else {
            head = nodeB;
            head.next = mergeRecursion(nodeA, nodeB.next);
        }
        return head;
    }

    public static void main(String[] args) {
        MergeOrderNode mergeOrderNode = new MergeOrderNode();
        ListNode node = mergeOrderNode.mergeNodes(NodeUtils.buildNodes(new int[]{1, 3, 5, 7, 9}), NodeUtils.buildNodes(new int[]{2, 4, 6, 8, 10}));
        ListNode node1 = mergeOrderNode.mergeNodes(NodeUtils.buildNodes(new int[]{1, 3, 5, 7, 9}), null);
        ListNode node2 = mergeOrderNode.mergeRecursion(NodeUtils.buildNodes(new int[]{1, 3, 5, 7, 9}), NodeUtils.buildNodes(new int[]{2, 4, 6, 8, 10}));
//        NodeUtils.printNode(node);
//        NodeUtils.printNode(node1);
        NodeUtils.printNode(node2);
    }
}
