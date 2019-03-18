package com.company.leetcode._181217;

public class _443 {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a'}));
    }

    public static int compress(char[] chars) {
        int length = chars.length;
        if (length == 0) {
            return 0;
        }
        char temp = chars[0];
        int count = 1;
        int index = 0;
        for (int i = 1; i < length; i++) {
            if (i != length - 1 && chars[i] == temp) {
                count++;
            } else {
                boolean isLast = false;
                if(chars[i] == temp){
                    count++;
                    isLast = true;
                }
                if(count != 1){
                    if (count > 9) {
                        char[] countArr = String.valueOf(count).toCharArray();
                        int length1 = countArr.length;
                        for (int j = 0; j < length1; j++) {
                            chars[++index] = countArr[j];
                        }
                    } else {
                        chars[++index] = (char) (count + '0');
                    }
                }
                if(isLast){
                    break;
                }
                temp = chars[i];
                chars[++index] = temp;
                count = 1;
            }
        }
        return index + 1;
    }
}
