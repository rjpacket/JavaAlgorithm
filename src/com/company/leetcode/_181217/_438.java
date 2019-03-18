package com.company.leetcode._181217;

import java.util.ArrayList;
import java.util.List;

public class _438 {

    public static void main(String[] args) {
        List<Integer> anagrams = findAnagrams("abab", "ab");
        for (Integer anagram : anagrams) {
            System.out.println(anagram);
        }
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int length = s.length();
        int length1 = p.length();
        int[] arr = new int[26];
        for (int i = 0; i <= length - length1; i++) {
            for (int j = 0; j < 26; j++) {
                arr[j] = 0;
            }
            for (int j = 0; j < length1; j++) {
                arr[p.charAt(j) - 'a'] += 1;
            }
            for (int j = i; j < length1 + i; j++) {
                arr[s.charAt(j) - 'a'] -= 1;
            }
            boolean isZero = true;
            for (int j = 0; j < 26; j++) {
                if (arr[j] != 0) {
                    isZero = false;
                    break;
                }
            }
            if (isZero) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findAnagrams1(String s, String p) {
        List<Integer> ret = new ArrayList<>();
        int length = s.length();
        int length1 = p.length();
        if (length < length1) {
            return ret;
        }
        int[] arr = new int[26];
        for (int i = 0; i < length1; i++) {
            arr[p.charAt(i) - 'a'] += 1;
        }
        int low = 0, high = 0;
        int count = length1;
        while (high < length1) {
            if (arr[p.charAt(high) - 'a'] >= 1) {
                count--;
            }
            arr[p.charAt(high) - 'a']--;
            high++;
            if (count == 0) {
                ret.add(low);
            }
            if (high - low == length1) {
                if (arr[p.charAt(low) - 'a'] >= 0) {
                    count++;
                }
                arr[p.charAt(low) - 'a']++;
                low++;
            }
        }
        return ret;
    }
}
