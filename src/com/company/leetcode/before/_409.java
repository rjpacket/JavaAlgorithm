package com.company.leetcode.before;

import java.util.HashMap;
import java.util.Map;

public class _409 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }

    public static int longestPalindrome(String s) {
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char key = s.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int sum = 0;
        for (Character key : map.keySet()) {
            sum += map.get(key) / 2;
        }
        int result = sum * 2 + 1;
        return result > length ? length : result;
    }
}
