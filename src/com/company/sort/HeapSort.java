package com.company.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 堆排序  太几把难理解了
 * Created by An on 2018/4/26.
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = new int[]{16,9, 8,15,13,12,14,2,3,1,4,7,6,5,11,10};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            adjustHeap(arr, 0, i);   //有一点理解了 已经是最大堆了 并不需要从尾开始遍历构造最大堆，只要将顶部的值下沉就行
        }
    }

    private static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int j = i * 2 + 1; j < length; j = j * 2 + 1) {
            if (j + 1 < length && arr[j] < arr[j + 1]) {
                j++;
            }
            if (arr[j] > temp) {
                arr[i] = arr[j];
                i = j;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
