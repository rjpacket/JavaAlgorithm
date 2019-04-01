package com.company.swordOffer.sword00035;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class ArrayAppearOnce {
    public void appear(int[] array, int[] num1, int[] num2){
        if(array == null || array.length == 0){
            return;
        }
        int xor = 0;
        int flag = 1;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            xor ^= array[i];
        }
        //位运算 找出等于1的位置
        while ((xor & flag) == 0){
            flag <<= 1;
        }
        for (int i = 0; i < length; i++) {
            if((array[i] & flag) == 0){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }
    }

    public static void main(String[] args) {
        ArrayAppearOnce arrayAppearOnce = new ArrayAppearOnce();
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        arrayAppearOnce.appear(new int[]{5,2,2,3,3,7}, num1, num2);
        System.out.println(num1[0] + "|" + num2[0]);
    }
}
