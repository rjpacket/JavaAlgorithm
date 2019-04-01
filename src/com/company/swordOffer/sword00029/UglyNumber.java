package com.company.swordOffer.sword00029;

/**
 * 丑数
 */
public class UglyNumber {
    public int ugly(int N){
        if(N <= 0){
            return 0;
        }
        int uglyNumber = 0;
        int count = 0;
        while (count < N){
            uglyNumber++;
            if(isUglyNumber(uglyNumber)){
                count++;
            }
        }
        return uglyNumber;
    }

    private boolean isUglyNumber(int uglyNumber) {
        while (uglyNumber % 2 == 0){
            uglyNumber /= 2;
        }
        while (uglyNumber % 3 == 0){
            uglyNumber /= 3;
        }
        while (uglyNumber % 5 == 0){
            uglyNumber /= 5;
        }
        return uglyNumber == 1;
    }

    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        System.out.println(uglyNumber.ugly(8));
    }
}
