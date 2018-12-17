package com.company.leetcode.before;

import java.util.HashMap;

public class _389 {
    public static void main(String[] args) {

    }

    public static char findTheDifference(String s, String t) {
        int length = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char key = s.charAt(i);
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }

        int length1 = t.length();
        for (int i = 0; i < length1; i++) {
            char key = t.charAt(i);
            if(map.containsKey(key)){
                Integer integer = map.get(key);
                if(integer - 1 < 0){
                    return key;
                }else{
                    map.put(key, integer - 1);
                }
            }else{
                return key;
            }
        }

        return 'a';
    }
}
