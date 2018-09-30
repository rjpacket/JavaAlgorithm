package com.company.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _205 {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("title", "paper"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int length = s.length();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(map.containsKey(sc)){
                Character character = map.get(sc);
                if(character == tc){
                    continue;
                }else{
                    return false;
                }
            }else{
                map.put(sc, tc);
            }
        }
        return true;
    }
}
