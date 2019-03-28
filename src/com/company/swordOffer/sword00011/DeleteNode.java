package com.company.swordOffer.sword00011;

import com.company.bean.ListNode;

/**
 * 在O(1)的时间复杂度内删除单链表的节点
 * <p>
 * 1. 如果删除节点下一个节点不为null，直接将下一个节点的值赋给删除节点，再把删除节点的下一个节点引用指向下一个节点的下一个节点
 * <p>
 * 2. 如果头节点和删除节点相等，说明链表只有一个节点，直接头节点置为null就行
 * <p>
 * 3. 否则删除节点是尾节点，遍历删除
 * <p>
 * 注意：头节点一定要返回出去，否则修改的只是局部变量的指向，并没有修改原头节点。
 */
public class DeleteNode {

    public ListNode deleteNode(ListNode head, ListNode del) {
        if (head == null) {
            return null;
        }
        if (del == null) {
            return head;
        }
        if (del.next != null) {
            del.value = del.next.value;
            del.next = del.next.next;
        } else if (head == del) {
            return null;
        } else {
            ListNode temp = head;
            while (temp.next != del) {
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }

    public void setNull(ListNode node) {

    }

    public static void main(String[] args) {
        ListNode del = new ListNode(3, new ListNode(2));
        ListNode head = new ListNode(5, new ListNode(4, del));
        DeleteNode deleteNode = new DeleteNode();
        head = deleteNode.deleteNode(head, null);
        printNode(head);
    }

    public static void printNode(ListNode node) {
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
