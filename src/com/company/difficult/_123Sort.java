package com.company.difficult;

public class _123Sort {
    public void sort(int[] array){
        if(array == null || array.length == 0){
            return;
        }
        int p0 = 0;
        int p1 = array.length - 1;
        for (int i = 0; i < p1; i++) {
            while (array[i] == 2 && i < p1){
                int temp = array[i];
                array[i] = array[p1];
                array[p1] = temp;
                p1--;
            }

            while (array[i] == 0 && i > p0){
                int temp = array[i];
                array[i] = array[p0];
                array[p0] = temp;
                p0++;
            }
        }
    }

    public static void main(String[] args) {
        _123Sort sort = new _123Sort();
        int[] array = {0, 0, 1, 0, 1, 2, 1, 0};
        sort.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
