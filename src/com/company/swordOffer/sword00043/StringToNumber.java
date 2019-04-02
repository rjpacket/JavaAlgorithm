package com.company.swordOffer.sword00043;

public class StringToNumber {
    public int parse(String number) {
        if (number == null || "".equals(number)) {
            return 0;
        }
        char[] chars = number.toCharArray();
        int value = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '+' || chars[i] == '-') {
                continue;
            }
            if (chars[i] < '0' || chars[i] > '9') {
                return 0;
            }
            value = value * 10 + chars[i] - '0';
        }
        if (number.startsWith("-")) {
            return -value;
        }
        return value;
    }

    public static void main(String[] args) {
        StringToNumber stringToNumber = new StringToNumber();
        int parse = stringToNumber.parse("123b45");
        System.out.println(parse);
    }
}
