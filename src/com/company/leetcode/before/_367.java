package com.company.leetcode.before;

public class _367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare1(15));
    }

    /**
     * 超时
     * @param num
     * @return
     */
    public static boolean isPerfectSquare(int num) {
        if(num <= 0){
            return false;
        }
        if(num == 1){
            return true;
        }
        int left = 1;
        int right = num;
        while (left <= right){
            int mid = (left + right) / 2;
            int midSq = mid * mid;
            if(midSq == num){
                return true;
            }else if(midSq > num){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }

    public static boolean isPerfectSquare1(int num) {
        int sumnum = 1;
        while (num > 0){
            num -= sumnum;
            sumnum += 2;
        }
        return num == 0;
    }
}
