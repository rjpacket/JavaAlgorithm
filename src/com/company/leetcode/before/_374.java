package com.company.leetcode.before;

public class _374 {
    public static void main(String[] args) {
        System.out.println(guessNumber(2126753390));
    }

    public static int guessNumber(int n) {
        int left = 0;
        int right = n;
        int guess = left + (right - left) / 2;
        int flag = guess(guess);
        while (flag != 0){
            if(flag > 0){
                left = guess + 1;
            }else if(flag < 0){
                right = guess - 1;
            }
            guess = left + (right - left) / 2;
            flag = guess(guess);
        }
        return guess;
    }

    public static int guess(int num){
        if(num == 1702766719){
            return 0;
        }else if(num > 1702766719){
            return 1;
        }else{
            return -1;
        }
    }
}
