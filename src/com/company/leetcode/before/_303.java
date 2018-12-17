package com.company.leetcode.before;

public class _303 {
    public static void main(String[] args) {

    }

    /**
     * 不符合多次调用的写法
     */
    class NumArray {
        private int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int i, int j) {
            int sum = 0;
            for (int k = i; k <= j; k++) {
                sum += nums[k];
            }
            return sum;
        }
    }

    class NumArrayBest {
        private int[] sums;

        public NumArrayBest(int[] nums) {
            int length = nums.length;
            sums = new int[length];
            if(length == 0){
                return;
            }
            sums[0] = nums[0];
            for (int i = 1; i < length; i++) {
                sums[i] = sums[i - 1] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            if(i == 0){
                return sums[j];
            }else{
                return sums[j] - sums[i -1];
            }
        }
    }
}
