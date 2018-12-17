package com.company.leetcode.before;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by An on 2018/5/31.
 */
public class _118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> total = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> ceng = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j == 0 || j == i - 1){
                    ceng.add(1);
                }else {
                    if (i != 1 && i != 2) {
                        List<Integer> list = total.get(i - 2);
                        ceng.add(list.get(j - 1) + list.get(j));
                    }
                }
            }
            total.add(ceng);
        }
        return total;
    }
}
