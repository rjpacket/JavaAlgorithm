package com.company.leetcode;

/**
 * 给定一个32位正整数 n，你需要找到最小的32位整数，其与 n 中存在的位数完全相同，并且其值大于n。如果不存在这样的32位整数，则返回-1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 12
 * 输出: 21
 * 示例 2:
 * <p>
 * 输入: 21
 * 输出: -1
 * Created by An on 2018/4/19.
 */
public class _556 {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(12443322));
    }

    public static int nextGreaterElement(int n) {
        String s = String.valueOf(n);
        int length = s.length();
        if (length == 1) {
            return -1;
        }
        String[] split = s.split("");
        M:
        for (int k = 0; k < length - 1; k++) {
            for (int i = length - 2, j = length - 1; i >= 0; j--, i = j - 1) {
                if (Integer.parseInt(split[i]) < Integer.parseInt(split[j])) {
                    for (int l = j; l < length; l++) {
                        for (int m = l + 1; m < length; m++) {
                            if (Integer.parseInt(split[l]) > Integer.parseInt(split[m])) {
                                String temp = split[l];
                                split[l] = split[m];
                                split[m] = temp;
                            }
                        }
                    }
                    for (int l = j; l < length; l++) {
                        if (Integer.parseInt(split[i]) < Integer.parseInt(split[l])) {
                            String temp = split[i];
                            split[i] = split[l];
                            split[l] = temp;
                            break M;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        StringBuilder ret = new StringBuilder();
        for (String s1 : split) {
            ret.append(s1);
        }
        long i1 = Long.parseLong(ret.toString());
        if (i1 > n && i1 < Math.pow(2, 31)) {
            return (int) i1;
        }
        return -1;
    }
}
