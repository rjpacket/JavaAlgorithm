package com.company.leetcode.before;

/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * <p>
 * 例如，
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 示例 1:
 * <p>
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 * <p>
 * 输入: "ZY"
 * 输出: 701
 */
public class _171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZZ"));
    }

    public static int titleToNumber(String s) {
        int value = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                value += s.charAt(i) - 'A' + 1;
            } else {
                value = (value + (s.charAt(i) - 'A' + 1)) * 26;
            }
        }
        return value;
    }
}
