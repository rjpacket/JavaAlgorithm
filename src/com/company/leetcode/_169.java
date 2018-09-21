package com.company.leetcode;

import java.util.HashMap;
import java.util.Set;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 */
public class _169 {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 4, 1}));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                Integer count = map.get(nums[i]);
                map.put(nums[i], ++count);
            } else {
                map.put(nums[i], 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        int key = nums[0];
        int max = map.get(key);
        for (Integer integer : keySet) {
            Integer current = map.get(integer);
            if (current > max) {
                max = current;
                key = integer;
            }
        }
        return key;
    }
}
