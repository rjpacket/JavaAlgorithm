package com.company.leetcode.before;

public class _268 {
    public static void main(String[] args) {

    }

    public static int missingNumber(int[] nums) {
        int[] arr = new int[nums.length + 1];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            arr[nums[i]] = 1;
        }
        for (int i = 0; i < length + 1; i++) {
            if(arr[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
