package com.company.leetcode.before;

import java.util.ArrayList;
import java.util.List;

/**
 * 在一个由小写字母构成的字符串 S 中，包含由一些连续的相同字符所构成的分组。
 * <p>
 * 例如，在字符串 S = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
 * <p>
 * 我们称所有包含大于或等于三个连续字符的分组为较大分组。找到每一个较大分组的起始和终止位置。
 * <p>
 * 最终结果按照字典顺序输出。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abbxxxxzzy"
 * 输出: [[3,6]]
 * 解释: "xxxx" 是一个起始于 3 且终止于 6 的较大分组。
 * 示例 2:
 * <p>
 * 输入: "abc"
 * 输出: []
 * 解释: "a","b" 和 "c" 均不是符合要求的较大分组。
 * 示例 3:
 * <p>
 * 输入: "abcdddeeeeaabbbcd"
 * 输出: [[3,5],[6,9],[12,14]]
 * 说明:  1 <= S.length <= 1000
 */
public class _830 {
    public static void main(String[] args) {
        System.out.println(largeGroupPositions("aaa"));
    }

    public static List<List<Integer>> largeGroupPositions(String S) {
        int length = S.length();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < length - 2; i++) {
            int index = i + 1;
            List<Integer> positions = new ArrayList<>();
            while (S.charAt(index) == S.charAt(i)) {
                index++;
                if (index >= length) {
                    break;
                }
            }
            if (index - i >= 3) {
                positions.add(i);
                positions.add(index - 1);
                result.add(positions);
                i = index - 1;
            }
        }
        return result;
    }
}
