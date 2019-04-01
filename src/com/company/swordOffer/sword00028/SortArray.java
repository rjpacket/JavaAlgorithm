package com.company.swordOffer.sword00028;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给定一个数组，把数组排成最小的数
 * <p>
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class SortArray {
    public String sort(int[] arrays) {
        if (arrays == null || arrays.length == 0) {
            return "";
        }
        int length = arrays.length;

        String[] tempArray = new String[length];
        for (int i = 0; i < length; i++) {
            tempArray[i] = String.valueOf(arrays[i]);
        }

        Arrays.sort(tempArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(tempArray[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        System.out.println(sortArray.sort(new int[]{3, 22, 111}));
    }
}
