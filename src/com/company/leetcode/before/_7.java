package com.company.leetcode.before;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 * Created by An on 2018/4/19.
 */
public class _7 {
    public static void main(String[] args) {

    }

    public static int reverse(int x) {
        boolean flag = false;
        if (x < 0) {
            x = -x;
            flag = true;
        }
        String s = String.valueOf(x);
        String[] split = s.split("");
        int length = s.length();
        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            if (j > i) {
                String temp = split[j];
                split[j] = split[i];
                split[i] = temp;
            }
        }
        String ret = "";
        for (String s1 : split) {
            ret += s1;
        }
        try {
            return flag ? -Integer.parseInt(ret) : Integer.parseInt(ret);
        } catch (Exception e) {
            return 0;
        }
    }
}
