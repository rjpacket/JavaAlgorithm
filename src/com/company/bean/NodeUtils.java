package com.company.bean;

public class NodeUtils {

    public static void printNode(ListNode node) {
        while (node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static ListNode buildNodes(int[] array) {
        int length = array.length;
        ListNode head = new ListNode(array[0]);
        ListNode temp = head;
        for (int i = 1; i < length; i++) {
            head.next = new ListNode(array[i]);
            head = head.next;
        }
        return temp;
    }

    public static TreeNode buildTree(int[] array){
        int length = array.length;
        TreeNode root = new TreeNode(array[0]);
        return root;
    }
}
