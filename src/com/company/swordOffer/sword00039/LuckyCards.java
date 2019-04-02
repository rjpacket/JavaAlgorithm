package com.company.swordOffer.sword00039;

import java.util.Arrays;

/**
 * 判断卡牌是不是顺子 12345 大王小王当作癞子，记为数字0
 */
public class LuckyCards {
    public boolean isLucky(int[] numbers) {
        if (numbers == null || numbers.length != 5) {
            return false;
        }
        Arrays.sort(numbers);
        int length = numbers.length;
        int zeroCount = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] == 0) {
                zeroCount++;
            } else {
                break;
            }
        }
        int small = zeroCount;
        int big = small + 1;
        int gap = 0;
        while (big < length) {
            if(numbers[big] == numbers[small]){
                return false;
            }
            gap += numbers[big] - numbers[small] - 1;
            small++;
            big++;
        }
        return gap < zeroCount;
    }

    public static void main(String[] args) {
        LuckyCards luckyCards = new LuckyCards();
        boolean lucky = luckyCards.isLucky(new int[]{0, 0, 1, 3, 1});
        System.out.println(lucky);
    }
}
