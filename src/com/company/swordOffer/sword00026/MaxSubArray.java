package com.company.swordOffer.sword00026;

/**
 * 获取一个序列的最大连续子序列，序列有正数有负数
 */
public class MaxSubArray {

    public int getMaxSubArray(int[] array){
        int max = array[0];
        int length = array.length;
        int sum = array[0];
        for (int i = 1; i < length; i++) {
            if(sum < 0){
                sum = array[i];
            }else{
                sum += array[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.getMaxSubArray(new int[]{5,-6,7,8,9,-3,4}));
    }
}
