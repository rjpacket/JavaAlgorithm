package com.company.leetcode.before;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 */
public class _219 {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int length = nums.length;
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (maps.containsKey(nums[i])) {
                Integer integer = maps.get(nums[i]);
                if (Math.abs(integer - i) <= k) {
                    return true;
                } else {
                    maps.put(nums[i], i);
                }
            } else {
                maps.put(nums[i], i);
            }
        }
        return false;
    }
}
