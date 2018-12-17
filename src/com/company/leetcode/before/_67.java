package com.company.leetcode.before;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * <p>
 * 输入为非空字符串且只包含数字 1 和 0。
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class _67 {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        int lenA = a.length();
        int[] arrA = new int[lenA];
        for (int i = lenA - 1; i >= 0; i--) {
            arrA[lenA - 1 - i] = Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        int lenB = b.length();
        int[] arrB = new int[lenB];
        for (int i = lenB - 1; i >= 0; i--) {
            arrB[lenB - 1 - i] = Integer.parseInt(String.valueOf(b.charAt(i)));
        }
        int length = lenA;
        if (lenA < lenB) {
            length = lenB;
        }
        StringBuilder sb = new StringBuilder();
        int plus = 0;
        for (int i = 0; i < length; i++) {
            int v1 = 0;
            int v2 = 0;
            if (i < lenA) {
                v1 = arrA[i];
            }
            if (i < lenB) {
                v2 = arrB[i];
            }
            if (v1 + v2 + plus > 2) {
                sb.append(1);
                plus = 1;
            } else if (v1 + v2 + plus == 2) {
                sb.append(0);
                plus = 1;
            } else {
                sb.append(v1 + v2 + plus);
                plus = 0;
            }
        }
        if (plus > 0) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
