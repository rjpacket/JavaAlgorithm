package com.company.swordOffer.sword00041;

public class NumberSum {
    public int sum(int n){
        int total = n;
        boolean flag = (n > 0) && ((total += sum(n - 1)) < 0);
        return total;
    }

    public static void main(String[] args) {
        NumberSum numberSum = new NumberSum();
        int sum = numberSum.sum(3);
        System.out.println(sum);
    }
}
