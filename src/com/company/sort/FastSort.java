package com.company.sort;

/**
 * 快速排序
 * Created by An on 2018/4/26.
 */
public class FastSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 7, 6, 9, 2, 8, 0, 3, 5};
        quickSort(arr, 0, arr.length - 1);
    }

    public static int partSort(int[] arr, int left, int right) {
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
