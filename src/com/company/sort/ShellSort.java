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

    public static void shellSort(int[] data) {
        int j = 0;
        int temp = 0;
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < data.length; i++) {
                temp = data[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    if (data[j] > temp) {
                        data[j + increment] = data[j];
                    } else {
                        break;
                    }
                }
                data[j + increment] = temp;
            }
        }
    }
}
