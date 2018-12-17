package com.company.leetcode.before;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class _14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"aa", "a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String temp = strs[0];
        for (String str : strs) {
            if (str.length() < temp.length()) {
                temp = str;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            if (i >= temp.length()) {
                break;
            }
            char ch = temp.charAt(i);
            boolean isSame = true;
            for (String str : strs) {
                if (str.charAt(i) != ch) {
                    isSame = false;
                }
            }
            if (isSame) {
                sb.append(ch);
                i++;
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
