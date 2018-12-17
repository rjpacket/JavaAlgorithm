package com.company.sort;

import com.company.bean.ListNode;

/**
 * 快速排序
 * Created by An on 2018/4/26.
 */
public class FastSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 11, 7, 6, 9, 2, 8, 12, 3, 5};
        quickSort(arr, 0, arr.length - 1);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode reverse = reverse(null, node1);
        while (reverse != null){
            System.out.println(reverse.val);
            reverse = reverse.next;
        }
    }

    public static ListNode reverse(ListNode preNode, ListNode head){
        if(head == null){
            return preNode;
        }
        ListNode newHead = head.next;
        head.next = preNode;
        return reverse(head, newHead);
    }

    /**
     * 左右分区的交换写法
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int partSort1(int[] arr, int left, int right) {
        int key = arr[right];
        int keyIndex = right;
        while (left < right) {
            while (left < right && arr[left] <= key) {
                left++;
            }
            while (left < right && arr[right] >= key){
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        arr[keyIndex] = arr[left];
        arr[left] = key;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return left;
    }

    public static void quickSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int index = partSort(arr, left, right);
        quickSort(arr, left, index - 1);
        quickSort(arr, index + 1, right);
    }

    /**
     * 左右分区的遍历写法
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int partSort(int[] arr, int left, int right) {
        int key = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if(arr[j] < key){
                swap(arr, j , i);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void fastSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int key = arr[left];

        while (i < j) {
            while (i < j && arr[j] > key) {
                j--;
            }
            while (i < j && arr[i] <= key) {
                i++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        fastSort(arr, left, i - 1);
        fastSort(arr, i + 1, right);
    }
}
