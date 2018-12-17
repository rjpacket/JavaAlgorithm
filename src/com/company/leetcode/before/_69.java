package com.company.leetcode.before;

/**
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 */
public class _69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(1000));
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double err = 1e-15;

        double t = x;

        while (Math.abs(t - x / t) > err * t)

            t = (x / t + t) / 2.0;

        return (int) t;
    }

    /*
    if (x == 0) {
            return 0;
        }
        double g = x;
        while (Math.abs(g * g - x) > 0.000001) {
            g = (g + x / g) / 2;
        }
        return (int) g;

        */
}
