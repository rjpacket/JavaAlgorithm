package com.company.leetcode.before;

public class _242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("a", "b"));
    }

    /**
     * 超出时间限制
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram1(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int length = s.length();
        M:for (int i = 0; i < length; i++) {
            char sc = s.charAt(i);
            int length1 = t.length();
            boolean hasFind = false;
            for (int j = 0; j < length1; j++) {
                char tc = t.charAt(j);
                if(sc == tc){
                    hasFind = true;
                    if(j == length1 - 1) {
                        t = t.substring(0, j);
                    }else{
                        t = t.substring(0, j) + t.substring(j + 1, length1);
                    }
                    break;
                }
            }
            if(!hasFind){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < length; i++) {
            arr[t.charAt(i) - 'a'] -= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}
