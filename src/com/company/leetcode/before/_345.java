package com.company.leetcode.before;

public class _345 {
    public static void main(String[] args) {
        System.out.println(reverseString("leetcode"));
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int i = 0;
        int j = length - 1;
        while (i < j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }
}
