package com.company.leetcode;

import java.util.HashSet;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class _217 {

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        HashSet<Integer> keys = new HashSet<>();
        for (int i = 0; i < length; i++) {
            keys.add(nums[i]);
        }
        return keys.size() != length;
    }
}
