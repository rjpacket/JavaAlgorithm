package com.company.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆排序
 * Created by An on 2018/4/26.
 */
public class HeapSort {

    public static void main(String[] args) {
        List<Integer> heaps = new ArrayList<>();
        heaps.add(23);
        heaps.add(56);
        heaps.add(70);
        heaps.add(45);
        heaps.add(36);
        heapSort(heaps);
        for (Integer heap : heaps) {
            System.out.println("------------>" + heap);
        }
    }

    /**
     * 最大堆排序
     *
     * @param heaps
     * @param index
     */
    public static void maxHeap(List<Integer> heaps, int index) {
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;
        int maxIndex = index;
        int size = heaps.size();
        if (leftIndex < size && heaps.get(leftIndex) > heaps.get(index)) {
            maxIndex = leftIndex;
        }
        if (rightIndex < size && heaps.get(rightIndex) > heaps.get(index)) {
            maxIndex = rightIndex;
        }
        if (maxIndex != index) {
            int temp = heaps.get(index);
            heaps.set(index, heaps.get(maxIndex));
            heaps.set(maxIndex, temp);
        } else {
            return;
        }
        maxHeap(heaps, maxIndex);
    }

    /**
     * 构建最大堆
     */
    public static void buildMaxHeap(List<Integer> heaps) {
        int size = heaps.size();
        for (int i = (size - 1) / 2; i >= 0; i--) {
            maxHeap(heaps, i);
        }
    }

    /**
     * 堆排序
     *
     * @param heaps
     */
    public static void heapSort(List<Integer> heaps) {
        buildMaxHeap(heaps);
        int size = heaps.size();
        int count = 0;
        for (int i = size - 1; i > 0; i--) {
            int temp = heaps.get(i);
            heaps.set(i, heaps.get(0));
            heaps.set(0, temp);
            count++;
            maxHeap(heaps.subList(0, size - count), 0);
        }
    }
}
