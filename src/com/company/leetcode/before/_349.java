package com.company.leetcode.before;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _349 {
    public static void main(String[] args) {

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if(nums1[i] == nums2[j] && !result.contains(nums1[i])){
                    result.add(nums1[i]);
                    break;
                }
            }
        }
        int size = result.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}
