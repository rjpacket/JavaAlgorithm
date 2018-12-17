package com.company.leetcode.before;

public class _283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println("----------->" + num);
        }
    }

    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        if (length < 1) {
            return;
        }
        int zeroCount = 0;
        if (nums[length - 1] == 0) {
            zeroCount = 1;
        }
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < length - zeroCount; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[length - zeroCount - 1] = 0;
                zeroCount++;
            }
        }
    }
}
