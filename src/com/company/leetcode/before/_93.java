package com.company.leetcode.before;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by An on 2018/4/20.
 */
public class _93 {
    public static void main(String[] args) {
        List<String> strings = restoreIpAddresses("0000");
        for (String string : strings) {
            System.out.println("------->" + string + "\n");
        }
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> nums = new ArrayList<>();
        int length = s.length();
        if (length > 12) {
            return nums;
        }
        for (int i = 1; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    String sub1 = s.substring(0, i);
                    String sub2 = s.substring(i, j);
                    String sub3 = s.substring(j, k);
                    String sub4 = s.substring(k, length);
                    if ((sub1.length() != 1 && sub1.startsWith("0")) || (sub2.length() != 1 && sub2.startsWith("0")) || (sub3.length() != 1 && sub3.startsWith("0")) || (sub4.length() != 1 && sub4.startsWith("0"))) {
                        continue;
                    }
                    if (sub1.length() <= 3 && sub2.length() <= 3 && sub3.length() <= 3 && sub4.length() <= 3) {
                        if (Integer.parseInt(sub1) <= 255 && Integer.parseInt(sub2) <= 255 && Integer.parseInt(sub3) <= 255 && Integer.parseInt(sub4) <= 255) {
                            nums.add(sub1 + "." + sub2 + "." + sub3 + "." + sub4);
                        }
                    }
                }
            }
        }
        return nums;
    }
}
