package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class _20 {
    public static void main(String[] args) {
        System.out.println(isValid("["));
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> maps = new HashMap<>();
        maps.put(')', '(');
        maps.put('}', '{');
        maps.put(']', '[');
        LinkedList<Character> temp = new LinkedList<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (!maps.containsKey(ch)) {
                temp.addLast(ch);
            } else {
                Character character = maps.get(ch);
                if (temp.size() == 0 || temp.getLast() != character) {
                    return false;
                } else {
                    temp.removeLast();
                }
            }
        }
        if (temp.size() > 0) {
            return false;
        }
        return true;
    }
}
