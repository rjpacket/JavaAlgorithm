package com.company.leetcode.before;

public class _387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("z"));
    }

    /**
     * 效率不高
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {
        if(s.length() == 1){
            return 0;
        }
        int length = s.length();
        int i = 0;
        int j = 1;
        M:while (i < length){
            while (j < length){
                if(s.charAt(i) == s.charAt(j)){
                    i++;
                    j = 0;
                    continue M;
                }
                j++;
                if(i == j){
                    j++;
                }
                if(j >= length){
                    break M;
                }
            }
        }
        if(i >= length){
            return -1;
        }
        return i;
    }

    public static int firstUniqChar1(String s) {
        int length = s.length();
        if(length == 0){
            return -1;
        }
        int[] arr = new int[26];
        for (int i = 0; i < length; i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < length; i++) {
            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
