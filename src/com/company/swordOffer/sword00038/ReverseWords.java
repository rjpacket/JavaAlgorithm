package com.company.swordOffer.sword00038;

/**
 * 反转英文语句
 */
public class ReverseWords {
    public String reverse(String words){
        if(words == null || words.length() == 0 || !words.contains(" ")){
            return words;
        }
        char[] chars = words.toCharArray();
        int length = words.length();
        reverseWord(chars, 0, length - 1);
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < length){
            while (i < length && chars[i] == ' '){
                i++;
                start = i;
            }
            while (i < length && chars[i] != ' '){
                i++;
                end = i - 1;
            }
            reverseWord(chars, start, end);
        }
        return String.valueOf(chars);
    }

    private void reverseWord(char[] chars, int start, int end) {
        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String reverse = reverseWords.reverse("   I am a student.    ");
        System.out.println(reverse);
    }
}
