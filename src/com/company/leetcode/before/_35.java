package com.company.leetcode.before;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 */
public class _35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0 || nums[0] >= target) {
            return 0;
        }
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] < target && nums[i + 1] < target) {
                continue;
            }
            return i + 1;
        }
        return length;
    }
}
