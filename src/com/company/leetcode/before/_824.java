package com.company.leetcode.before;

/**
 * 给定一个由空格分割单词的句子 S。每个单词只包含大写或小写字母。
 * <p>
 * 我们要将句子转换为 “Goat Latin”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。
 * <p>
 * 山羊拉丁文的规则如下：
 * <p>
 * 如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
 * 例如，单词"apple"变为"applema"。
 * <p>
 * 如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 * 例如，单词"goat"变为"oatgma"。
 * <p>
 * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
 * 例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。
 * 返回将 S 转换为山羊拉丁文后的句子。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "I speak Goat Latin"
 * 输出: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 * 示例 2:
 * <p>
 * 输入: "The quick brown fox jumped over the lazy dog"
 * 输出: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 * 说明:
 * <p>
 * S 中仅包含大小写字母和空格。单词间有且仅有一个空格。
 * 1 <= S.length <= 150。
 */
public class _824 {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }

    public static String toGoatLatin(String S) {
        String ori = "aeiouAEIOU";
        String[] words = S.split(" ");
        StringBuilder sb = new StringBuilder();
        int length = words.length;
        for (int i = 0; i < length; i++) {
            String word = words[i];
            String start = word.substring(0, 1);
            if (!ori.contains(start) && word.length() != 1) {
                sb.append(word.substring(1, word.length())).append(start).append("ma");
                for (int j = 0; j < (i + 1); j++) {
                    sb.append("a");
                }
            } else {
                sb.append(word).append("ma");
                for (int j = 0; j < (i + 1); j++) {
                    sb.append("a");
                }
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
