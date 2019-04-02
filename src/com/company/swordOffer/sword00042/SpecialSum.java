package com.company.swordOffer.sword00042;

/**
 * 位运算 计算加法
 */
public class SpecialSum {
    public int sum(int m, int n){
        if(m == 0){
            return n;
        }
        if(n == 0){
            return m;
        }
        int sum = 0;
        int carry = 0;
        while (n != 0){
            sum = m ^ n;
            carry = (m & n) << 1;
            m = sum;
            n = carry;
        }
        return sum;
    }

    public static void main(String[] args) {
        SpecialSum specialSum = new SpecialSum();
        int sum = specialSum.sum(20, 10);
        System.out.println(sum);
    }
}
