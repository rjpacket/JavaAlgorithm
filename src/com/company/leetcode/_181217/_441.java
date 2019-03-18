package com.company.leetcode._181217;

public class _441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(6));
    }

    public static int arrangeCoins(int n) {
        return arrange(n, 1);
    }

    public static int arrange(int n, int m) {
        if(n - m < 0){
            return m - 1;
        }
        return arrange(n - m, ++m);
    }
}
