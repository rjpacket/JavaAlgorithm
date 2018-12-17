package com.company.leetcode.before;

public class _290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String str) {
        int length = pattern.length();
        String[] split = str.split(" ");
        int length1 = split.length;
        if(length != length1){
            return false;
        }
        String[] box = new String[26];
        for (int i = 0; i < length; i++) {
            char ch = pattern.charAt(i);
            if(box[ch - 'a'] == null){
                for (String s : box) {
                    if(split[i].equals(s)){
                        return false;
                    }
                }
                box[ch - 'a'] = split[i];
            }else{
                if(box[ch - 'a'].equals(split[i])){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
