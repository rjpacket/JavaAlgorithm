package com.company.swordOffer.sword00037;

import java.util.ArrayList;
import java.util.List;

/**
 * 和为sum的连续正数序列   1,2,3,4,5,6
 */
public class ContinuousOrderArray {
    public ArrayList<ArrayList<Integer>> findList(int sum){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int min = 1;
        int max = 2;
        int curSum = min + max;
        while (min < max && min < (sum + 1) / 2){
            if(curSum == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = min; i <= max; i++) {
                    list.add(i);
                }
                result.add(list);
                curSum -= min;
                min++;
                max++;
                curSum += max;
            }else if(curSum < sum){
                max++;
                curSum += max;
            }else{
                curSum -= min;
                min++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ContinuousOrderArray continuousOrderArray = new ContinuousOrderArray();
        ArrayList<ArrayList<Integer>> list = continuousOrderArray.findList(12);
        for (ArrayList<Integer> integers : list) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
