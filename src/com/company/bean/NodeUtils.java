package com.company.bean;

public class NodeUtils {

    public static void printNode(ListNode node) {
        while (node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static void printTree(TreeNode root) {
        if(root != null) {
            System.out.println(root.value);
            printTree(root.left);
            printTree(root.right);
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

    public static int getDeep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ld = getDeep(root.left);
        int rd = getDeep(root.right);
        return ld > rd ? (ld + 1) : (rd + 1);
    }
}
