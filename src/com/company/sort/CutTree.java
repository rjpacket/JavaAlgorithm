package com.company.sort;

public class CutTree {
    public static void main(String[] args) {
        System.out.println(cutTree(new int[]{3,4,5,4}));
    }

    public static int cutTree(int[] array){
        int length = array.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            boolean isOrder = true;
            for (int j = 0; j < length - 1; j++) {
                if(j == i - 1){
                    if(j < length - 2){
                        if(array[j] > array[j + 2]){
                            isOrder = false;
                        }
                    }
                }else if(j == i){
                    continue;
                }else{
                    if(array[j] > array[j + 1]){
                        isOrder = false;
                    }
                }
            }
            if(isOrder){
                count++;
            }
        }
        return count;
    }
}
