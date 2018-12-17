package com.company.leetcode.before;

public class _326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }

    public static boolean isPowerOfThree(int n) {
        while (n >= 3 && n % 3 == 0){
            n = n / 3;
        }
        return n == 1;
    }
}
