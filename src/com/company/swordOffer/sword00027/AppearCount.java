package com.company.swordOffer.sword00027;

/**
 * 从1到N所有正数中1出现的次数
 *
 * 暴力方法
 *
 */
public class AppearCount {

    public int getAppearCount(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            count += getCount(i);
        }
        return count;
    }

    private int getCount(int i) {
        int count = 0;
        while (i != 0) {
            if (i % 10 == 1) {
                count++;
            }
            i /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        AppearCount appearCount = new AppearCount();
        System.out.println(appearCount.getAppearCount(11));
    }
}
