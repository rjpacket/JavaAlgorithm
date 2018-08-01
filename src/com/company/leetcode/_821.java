package com.company.leetcode;

/**
 * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 * <p>
 * 示例 1:
 * <p>
 * 输入: S = "loveleetcode", C = 'e'
 * 输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 * 说明:
 * <p>
 * 字符串 S 的长度范围为 [1, 10000]。
 * C 是一个单字符，且保证是字符串 S 里的字符。
 * S 和 C 中的所有字母均为小写字母。
 */
public class _821 {
    public static void main(String[] args) {
        int[] x = shortestToChar("loveleetcode", 'e');
        for (int i : x) {
            System.out.println(i);
        }
    }

    public static int[] shortestToChar(String S, char C) {
        String[] words = S.split("");
        int length = words.length;
        int[] steps = new int[length];
        for (int i = 0; i < length; i++) {
            int step = 0;
            int leftIndex = i - step;
            int rightIndex = i + step;
            while (S.charAt(leftIndex) != C && S.charAt(rightIndex) != C) {
                step++;
                leftIndex = i - step;
                rightIndex = i + step;
                if (leftIndex < 0) {
                    leftIndex = 0;
                }
                if (rightIndex > length - 1) {
                    rightIndex = length - 1;
                }
                if (step >= length) {
                    break;
                }
            }
            steps[i] = step;
        }
        return steps;
    }
}
