package com.company.swordOffer.sword00003;

/**
 * 替换字符串中的空格为%20
 * <p>
 * 这题怎么这么智障？
 */
public class ReplaceEmptyChar {

    public String replaceEmptyChar(String src) {
        if (src == null || "".equals(src)) {
            return src;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = src.length();
        for (int i = 0; i < length; i++) {
            char charAt = src.charAt(i);
            if (charAt == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ReplaceEmptyChar replaceEmptyChar = new ReplaceEmptyChar();
        System.out.println(replaceEmptyChar.replaceEmptyChar("   "));
    }
}
