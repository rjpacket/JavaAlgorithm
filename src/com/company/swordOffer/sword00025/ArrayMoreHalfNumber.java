package com.company.swordOffer.sword00025;

import java.util.HashMap;

/**
 * 找出数组中超过数组一半长度的一个数字
 * 暴力法
 * HashMap存储每一个数字的次数
 */
public class ArrayMoreHalfNumber {

    public int getMoreHalfNumber(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        //使用哈希表
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i]) + 1);
            }else{
                map.put(array[i], 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) > (array.length) / 2) {
                return array[i];
            }
        }
        //没有找到这样的数字
        return -1;
    }

    public static void main(String[] args) {
        ArrayMoreHalfNumber arrayMoreHalfNumber = new ArrayMoreHalfNumber();
        int moreHalfNumber = arrayMoreHalfNumber.getMoreHalfNumber(new int[]{5, 4, 5, 5, 5, 4, 5, 6, 7, 5});
        System.out.println(moreHalfNumber);
    }
}
