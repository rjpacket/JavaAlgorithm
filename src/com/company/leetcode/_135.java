package com.company.leetcode;

/**
 * Created by An on 2018/5/10.
 */
public class _135 {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1, 3, 2, 1, 2, 1}));
    }

    public static int candy(int[] ratings) {
        int length = ratings.length;
        int[] arr = new int[length];
        int minRate = ratings[0];
        int index = 0;
        for (int i = 1; i < length; i++) {
            if (ratings[i] < minRate) {
                minRate = ratings[i];
                index = i;
            }
        }
        arr[index] = 1;
        int sum = 1;
        for (int i = index + 1; i < length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            } else {
                arr[i] = 1;
            }
            sum += arr[i];
        }

        for (int i = index - 1; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                arr[i] = arr[i + 1] + 1;
            } else {
                arr[i] = 1;
            }
            sum += arr[i];
        }
        return sum;
    }
}
