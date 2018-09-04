package com.company.leetcode;

public class _168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(27));
    }

    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int remain;
        do{
            remain = n % 27;
            if(remain == 0){
                sb.append('Z');
            }else {
                sb.append((char) (remain + 'A' - 1));
            }
            n = n / 27;
        }while (n != 0);
        return sb.reverse().toString();
    }
}
