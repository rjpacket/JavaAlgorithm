package com.company.leetcode._181217;

import java.util.HashSet;

public class _414 {

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,1,2}));
    }

    public static int thirdMax(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int length = nums.length;
        HashSet<Integer> filter = new HashSet<>();
        for (int i = 0; i < length; i++) {
            filter.add(nums[i]);
        }

        int size = filter.size();
        int[] result = new int[size];
        int index = 0;
        for (Integer integer : filter) {
            result[index++] = integer;
        }

        if (result.length == 1) {
            return result[0];
        }
        if (result.length == 2) {
            return result[0] > result[1] ? result[0] : result[1];
        }

        findMax(result, 3, 0, result.length - 1);
        return result[2];
    }

    private static void findMax(int[] nums, int K, int left, int right) {
        int i = left;
        int j = right;
        int base = nums[right];
        while (i < j) {
            while (i < j && nums[i] >= base) {
                i++;
            }
            while (i < j && nums[j] <= base) {
                j--;
            }
            swap(nums, i, j);
        }
        swap(nums, j, right);

        if (K - 1 > j) {
            findMax(nums, K, j + 1, right);
        } else if (K - 1 < i) {
            findMax(nums, K, left, j - 1);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
