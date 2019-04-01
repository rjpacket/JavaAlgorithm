package com.company.swordOffer.sword00030;

import java.util.HashMap;

/**
 * 找出数组只出现一次的数字
 */
public class AppearOnce {

    public int findOnce(int[] array){
        if(array == null || array.length == 0){
            return -1;
        }
        HashMap<Integer, Integer> map = new HashMap();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i]) + 1);
            }else{
                map.put(array[i], 1);
            }
        }

        for (int i = 0; i < length; i++) {
            if(map.get(array[i]) == 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        AppearOnce appearOnce = new AppearOnce();
        int once = appearOnce.findOnce(new int[]{2, 3, 3, 3, 4, 4, 4, 2, 5, 6, 7});
        System.out.println(once);
    }
}
