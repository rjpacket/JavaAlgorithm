package com.company.sort;

/**
 * 希尔排序(步长排序)
 * Created by An on 2018/4/26.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 2, 45, 67, 89, 34, 8};
        shellSort(arr);
        for (int i : arr) {
            System.out.println("---------->" + i);
        }
    }

    public static void shellSort(int[] arr) {
        int length = arr.length;
        for (int gap = length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < length; i++) {
                int j = i;
                while (j - gap > 0 && arr[j] < arr[j - gap]) {
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
