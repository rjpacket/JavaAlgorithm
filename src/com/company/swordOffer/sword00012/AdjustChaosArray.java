package com.company.swordOffer.sword00012;

/**
 * 调整数组顺序使奇数位与偶数的后面
 * <p>
 * 1. 左右指针法
 * <p>
 * 2. 空间换时间的办法
 */
public class AdjustChaosArray {

    /**
     * 这是一种不稳定的调整
     * 调整完数组的原有顺序会被打乱
     *
     * @param array
     */
    public void adjustArray(int[] array) {
        if (array == null) {
            return;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && isOdd(array[left]))
                left++;
            while (left < right && !isOdd(array[right])) {
                right--;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }

    /**
     * 保持数组的原有顺序
     *
     * @param array
     * @return
     */
    public int[] adjustArrayKeepOrder(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0 || array.length == 1) {
            return array;
        }

        int length = array.length;
        int[] tempArray = new int[length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (isOdd(array[i])) {
                tempArray[count++] = array[i];
            }
        }
        for (int i = 0; i < length; i++) {
            if (!isOdd(array[i])) {
                tempArray[count++] = array[i];
            }
        }
        return tempArray;
    }

    private boolean isOdd(int i) {
        return (i & 1) == 1;
    }

    public static void main(String[] args) {
        AdjustChaosArray adjustChaosArray = new AdjustChaosArray();
        int[] a = {2, 3, 4, 4, 4, 4, 4, 8, 8, 9, 9, 9};
        adjustChaosArray.adjustArray(a);
//        a = adjustChaosArray.adjustArrayKeepOrder(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
