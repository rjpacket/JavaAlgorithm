package com.company.leetcode.before;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class _9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        int length = value.length();
        boolean flag = true;
        for (int i = 0, j = length - 1; i < j; i++, j--) {
            if (value.charAt(i) != value.charAt(j)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
