package com.company.leetcode.before;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * <p>
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * <p>
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: s = "paper", t = "title"
 * 输出: true
 * 说明:
 * 你可以假设 s 和 t 具有相同的长度。
 */
public class _205 {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "aa"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int length = s.length();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (map.containsKey(sc)) {
                Character character1 = map.get(sc);
                if (tc == character1) {
                    continue;
                } else {
                    return false;
                }
            } else {
                for (Character character : map.keySet()) {
                    if (map.get(character) == tc) {
                        return false;
                    }
                }
                map.put(sc, tc);
            }
        }
        return true;
    }
}
