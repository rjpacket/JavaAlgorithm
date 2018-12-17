package com.company.leetcode.before;

import java.util.ArrayList;
import java.util.List;

public class _350 {
    public static void main(String[] args) {
        int[] intersection = intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for (int i : intersection) {
            System.out.println(i);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        if(length1 > length2){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;

            length1 = nums1.length;
            length2 = nums2.length;
        }
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2 - count; j++) {
                if(nums1[i] == nums2[j]){
                    result.add(nums1[i]);
                    int temp = nums2[j];
                    for (int k = j + 1; k < length2; k++) {
                        nums2[k - 1] = nums2[k];
                    }
                    nums2[length2 - 1] = temp;
                    count++;
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
