package com.company.leetcode._181217;

public class _415 {

    public static void main(String[] args) {
        System.out.println(addStrings("123", "456888"));
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int jin = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0){
            int he = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + jin;
            if(he >= 10){
                sb.append(he - 10);
                jin = 1;
            }else{
                sb.append(he);
                jin = 0;
            }
            i--;
            j--;
        }
        while (i >= 0){
            int he = (num1.charAt(i) - '0') + jin;
            if(he >= 10){
                sb.append(he - 10);
                jin = 1;
            }else{
                sb.append(he);
                jin = 0;
            }
            i--;
        }

        while (j >= 0){
            int he = (num2.charAt(j) - '0') + jin;
            if(he >= 10){
                sb.append(he - 10);
                jin = 1;
            }else{
                sb.append(he);
                jin = 0;
            }
            j--;
        }
        if(jin > 0){
            return jin + sb.reverse().toString();
        }
        return sb.reverse().toString();
    }
}
