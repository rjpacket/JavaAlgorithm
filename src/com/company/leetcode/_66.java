package com.company.leetcode;

/**
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class _66 {
    public static void main(String[] args) {
        int[] x = plusOne(new int[]{1});
        for (int i : x) {
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{1};
        }
        int plus = 1;
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (i == 0) {
                if (digits[i] + plus == 10) {
                    digits[i] = 0;
                    int[] arr = new int[length + 1];
                    arr[0] = 1;
                    for (int j = 0; j < length; j++) {
                        arr[j + 1] = digits[j];
                    }
                    return arr;
                } else {
                    digits[i] += 1;
                    return digits;
                }
            } else {
                if (digits[i] + plus == 10) {
                    digits[i] = 0;
                    plus = 1;
                } else {
                    digits[i] += 1;
                    return digits;
                }
            }
        }
        return null;
    }
}
