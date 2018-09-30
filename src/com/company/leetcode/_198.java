package com.company.leetcode;

public class _198 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,3,4,5,2,3,2}));
    }

    public static int rob(int[] nums) {
        int length = nums.length;
        int count1 = 0;
        for (int i = 0; i < length; i += 2) {
            count1 += nums[i];
        }
        int count2 = 0;
        for (int i = 1; i < length; i += 2) {
            count2 += nums[i];
        }
        return count1 > count2 ? count1 : count2;
    }
}
