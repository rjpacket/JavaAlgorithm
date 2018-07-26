package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 示例：
 * <p>
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * <p>
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * <p>
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 * Created by An on 2018/4/18.
 */
public class _3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("jbpnbwwd"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        List<Character> ret = new ArrayList<>();
        List<List<Character>> rets = new ArrayList<>();
        rets.add(ret);
        M:
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (!ret.contains(s.charAt(j))) {
                    ret.add(s.charAt(j));
                } else {
                    ret = new ArrayList<>();
                    rets.add(ret);
                    continue M;
                }
            }
        }
        int count = 0;
        for (List<Character> characters : rets) {
            if (characters.size() > count) {
                count = characters.size();
            }
        }
        return count;
    }
}
