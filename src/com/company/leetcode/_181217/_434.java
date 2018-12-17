package com.company.leetcode._181217;

public class _434 {

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is     John"));
    }

    public static int countSegments(String s) {
        int count = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(c != ' '){
                count++;
            }
            while (i < length && s.charAt(i) != ' '){
                i++;
            }
        }
        return count;
    }
}
