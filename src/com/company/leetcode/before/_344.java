package com.company.leetcode.before;

public class _344 {
    public static void main(String[] args) {
        System.out.println(reverseString("leetcode"));
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int i = 0;
        int j = length - 1;
        while (i < j){
            while (i < j && (chars[i] != 'a' && chars[i] != 'e' && chars[i] != 'i' && chars[i] != 'o' && chars[i] != 'u'
                            && chars[i] != 'A' && chars[i] != 'E' && chars[i] != 'I' && chars[i] != 'O' && chars[i] != 'U')){
                i++;
            }
            while (i < j && (chars[j] != 'a' && chars[j] != 'e' && chars[j] != 'i' && chars[j] != 'o' && chars[j] != 'u'
                            && chars[j] != 'A' && chars[j] != 'E' && chars[j] != 'I' && chars[j] != 'O' && chars[j] != 'U')){
                j--;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }
}
