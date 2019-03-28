package com.company.swordOffer.sword00007;

/**
 * 旋转正序数组的最小元素
 * <p>
 * {4,5,1,2,3}
 * <p>
 * 正序数组，旋转之后，左边肯定比右边大，然后取中间值，
 * 1. 如果mid比左边大，所以mid落在左边上升区，最小值应该在mid右边，所以让left=mid，缩小一半的查找范围；
 * 2. 如果mid比左边小，所以mid落在右边上升区，最小值应该在mid左边，所以让right=mid，缩小一半的查找范围；
 * 3. 最终结果应该是一个落在最大值上，一个落在最小值上，返回right
 */
public class RotateArrayMinElement {

    public int getRotateArrayMinElement(int[] array) throws Exception {
        if (array == null) {
            throw new Exception("数组不能为空");
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (array[left] >= array[right]) {
            if (right - left == 1) {
                return array[right];
            }
            mid = (left + right) / 2;
            if (array[mid] == array[left] && array[mid] == array[right]) {
                return minElementInArray(array);
            } else {
                if (array[mid] >= array[left]) {
                    left = mid;
                } else if (array[mid] <= array[right]) {
                    right = mid;
                }
            }
        }
        return array[right];
    }

    private int minElementInArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        try {
            RotateArrayMinElement rotateArrayMinElement = new RotateArrayMinElement();
            int[] array = {3, 5, 1, 2, 3, 3, 3, 3, 3};
            System.out.println(rotateArrayMinElement.getRotateArrayMinElement(array));
        } catch (Exception e) {

        }
    }
}
