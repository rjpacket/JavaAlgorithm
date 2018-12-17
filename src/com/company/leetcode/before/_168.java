package com.company.leetcode.before;

/**
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 * <p>
 * 例如，
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 * <p>
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 * <p>
 * 输入: 701
 * 输出: "ZY"
 */
public class _168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(53));
    }

    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int remain;
        while (n != 0) {
            remain = n % 26;
            if (remain == 0) {
                sb.append('Z');
                n = n - 1;
            } else {
                sb.append((char) (remain + 'A' - 1));
            }
            n = n / 26;
        }
        return sb.reverse().toString();
    }
}
