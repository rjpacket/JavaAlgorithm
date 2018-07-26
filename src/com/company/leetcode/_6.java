package com.company.leetcode;

/**
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"
 * <p>
 * 实现一个将字符串进行指定行数变换的函数:
 * <p>
 * string convert(string s, int numRows);
 * 示例 1:
 * <p>
 * 输入: s = "PAYPALISHIRING", numRows = 3
 * 输出: "PAHNAPLSIIGYIR"
 * 示例 2:
 * <p>
 * 输入: s = "PAYPALISHIRING", numRows = 4
 * 输出: "PINALSIGYAHRPI"
 * 解释:
 * <p>
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Created by An on 2018/4/19.
 */
public class _6 {
    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int length = s.length();
        String a[][] = new String[numRows][length];
        M:
        for (int i = 0, j = 0, k = 0; i < length; ) {
            for (int l = 0; l < numRows; l++) {
                if (i >= length) {
                    break M;
                }
                a[j][k] = String.valueOf(s.charAt(i));
                j++;
                i++;
            }
            j -= 2;
            k++;
            for (int l = 0; l < numRows - 2; l++) {
                if (i >= length) {
                    break M;
                }
                a[j][k] = String.valueOf(s.charAt(i));
                j--;
                k++;
                i++;
            }

        }
        String result = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < length; j++) {
                if (a[i][j] != null) {
                    result += a[i][j];
                }
            }
        }
        return result;
    }
}
