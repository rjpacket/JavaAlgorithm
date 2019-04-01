package com.company.swordOffer.sword00034;

public class NumberCountOrderArray {
    public int getCount(int[] array, int K) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int firstIndex = getFirstIndex(array, 0, array.length - 1, K);
        int lastIndex = getLastIndex(array, 0, array.length - 1, K);
        if (firstIndex > -1 || lastIndex > -1) {
            return lastIndex - firstIndex + 1;
        }
        return 0;
    }

    private int getLastIndex(int[] array, int left, int right, int K) {
        if(left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        if(array[mid] > K){
            right = mid - 1;
        }else if(array[mid] < K){
            left = mid + 1;
        }else{
            if(mid != array.length - 1){
                if(array[mid + 1] != K){
                    return mid;
                }else{
                    left = mid + 1;
                }
            }else{
                return mid;
            }
        }
        return getLastIndex(array, left, right, K);
    }

    private int getFirstIndex(int[] array, int left, int right, int K) {
        if(left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        if(array[mid] > K){
            right = mid - 1;
        }else if(array[mid] < K){
            left = mid + 1;
        }else{
            if(mid != 0){
                if(array[mid - 1] != K){
                    return mid;
                }else{
                    right = mid - 1;
                }
            }else{
                return mid;
            }
        }
        return getFirstIndex(array, left, right, K);
    }

    public static void main(String[] args) {
        NumberCountOrderArray numberCountOrderArray = new NumberCountOrderArray();
        int count = numberCountOrderArray.getCount(new int[]{1, 2, 3, 4, 4, 4, 4, 4, 5, 6, 7, 8, 9, 10}, 11);
        System.out.println(count);
    }
}
