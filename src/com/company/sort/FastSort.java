package com.company.sort;

/**
 * 快速排序
 * Created by An on 2018/4/26.
 */
public class FastSort {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 65, 3, 89, 45, 47, 87, 25, 90};
        fastSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println("-------->" + i);
        }
    }

    public static void fastSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int i = left;
        int j = right;
        int key = arr[left];

        while (i < j){
            while (i < j && arr[j] > key){
                j--;
            }
            while (i < j && arr[i] <= key){
                i++;
            }
            if(i < j){
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
