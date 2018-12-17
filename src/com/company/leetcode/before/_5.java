package com.company.leetcode.before;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba"也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 * <p>
 * Created by An on 2018/4/19.
 */
public class _5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aa"));
    }

    public static String longestPalindrome(String s) {
        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();
        int count = 0;
        String result = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (count < length - i) {
                a.clear();
                b.clear();
                int innerCount = 0;
                for (int j = length - 1, k = i; k <= j && j >= 0; j--) {
                    if (s.charAt(k) == s.charAt(j)) {
                        if (k != j) {
                            a.add(s.charAt(k));
                            b.add(0, s.charAt(j));
                        } else {
                            a.add(s.charAt(k));
                        }
                        k++;
                    } else {
                        innerCount++;
                        a.clear();
                        b.clear();
                        k = i;
                        j = length - innerCount;
                        if (innerCount >= length) {
                            break;
                        }
                    }
                }
                int i1 = a.size() + b.size();
                if (i1 > count) {
                    count = i1;
                    result = "";
                    for (Character character : a) {
                        result += String.valueOf(character);
                    }

                    for (Character character : b) {
                        result += String.valueOf(character);
                    }
                }
            }
        }
        return result;
    }
}
