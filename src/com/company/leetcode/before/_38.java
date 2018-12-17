package com.company.leetcode.before;

/**
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 * <p>
 * 注意：整数顺序将表示为一个字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "1211"
 */
public class _38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        String start = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int length = start.length();
            for (int j = 0; j < length; j++) {
                int count = 0;
                char ch = start.charAt(j);
                while ((j + count) < length && ch == start.charAt(j + count)) {
                    count++;
                }
                sb.append(count).append(ch);
                j += count - 1;
            }
            start = sb.toString();
        }
        return start;
    }
}
