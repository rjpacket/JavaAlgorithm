package com.company.leetcode.before;

import java.util.HashMap;

public class _383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length = magazine.length();
        for (int i = 0; i < length; i++) {
            char key = magazine.charAt(i);
            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            }else{
                map.put(key, 1);
            }
        }

        int length1 = ransomNote.length();
        for (int i = 0; i < length1; i++) {
            char key = ransomNote.charAt(i);
            if(map.containsKey(key)){
                Integer integer = map.get(key);
                if(integer > 0) {
                    map.put(key, integer - 1);
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
