package com.company.swordOffer.sword00002;

/**
 * 给定一个二维数组，查找number是否在其中
 *
 * 思路：从右上角或者左下角开始查找，比较大小，如果比curNumber大，则row++，如果比curNumber小，则col--。
 */
public class FindXYArrays {

    public boolean findNumberInArrays(int[][] arrays, int number){
        if(arrays == null || arrays.length == 0){
            return false;
        }
        int length = arrays[0].length;
        int col = length - 1;
        int row = 0;
        while (col >= 0 && row < arrays.length){
            int curNumber = arrays[row][col];
            if(curNumber == number){
                return true;
            }else if(curNumber > number){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FindXYArrays findXYArrays = new FindXYArrays();
        int[][] array = new int[][]{{1,2,4,6, 10}, {2,4,7,8, 20}, {8,9,10,11, 30}, {9, 12,13,15, 50}};
        System.out.println(findXYArrays.findNumberInArrays(array, 29));
    }
}
