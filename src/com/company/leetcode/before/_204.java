package com.company.leetcode.before;

/**
 * 统计所有小于非负整数 n 的质数的数量。
 * <p>
 * 示例:
 * <p>
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class _204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n + 1];
        int count = 0;
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (!notPrimes[i]) {
                for (int j = i * i; j < n; j += i) {
                    notPrimes[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!notPrimes[i]) {
                count++;
            }
        }
        return count;
    }
}
