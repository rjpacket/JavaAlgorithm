package com.company.leetcode.before;

public class _405 {

    public static void main(String[] args) {
        System.out.println(toHex(-1));
    }

    public static String toHex(int num) {
        String hexString = "";
        char[] chs = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        while (num != 0) {
            hexString = chs[num & 0xf] + hexString;
            num = num >>> 4;
        }
        return hexString.isEmpty() ? "0" : hexString;
    }
}
