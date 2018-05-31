package com.company._386;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * <p>
 * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 中位数是 (2 + 3)/2 = 2.5
 * Created by An on 2018/4/18.
 */
public class _4 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2};
        System.out.println("------>" + findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] ret = new int[length];
        for (int i = 0; i < length; i++) {
            if (i < nums1.length) {
                ret[i] = nums1[i];
            } else {
                int target = nums2[i - nums1.length];
                int j = 0;
                for (j = i; j > 0 && ret[j - 1] > target; j--) {
                    ret[j] = ret[j - 1];
                }
                ret[j] = target;
            }
        }
        if (length % 2 == 0) {
            return (ret[length / 2] + ret[length / 2 - 1]) * 1.0 / 2;
        } else {
            return ret[length / 2] * 1.0;
        }
    }
}
