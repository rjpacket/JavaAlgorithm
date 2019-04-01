package com.company.swordOffer.sword00036;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class MultipleMinArray {
    public int[] getMinSum(int[] array, int sum) {
        if (array == null || array.length == 0) {
            return null;
        }
        int length = array.length;
        int left = 0;
        int right = length - 1;
        int[] result = new int[2];
        while (left < right) {
            if (array[left] + array[right] < sum) {
                left++;
            } else if (array[left] + array[right] > sum) {
                right--;
            } else {
                result[0] = array[left];
                result[1] = array[right];
                return result;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MultipleMinArray multipleMinArray = new MultipleMinArray();
        int[] minSum = multipleMinArray.getMinSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 100);
        for (int i : minSum) {
            System.out.println(i);
        }
    }
}
