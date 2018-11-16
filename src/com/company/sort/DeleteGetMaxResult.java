package com.company.sort;

public class DeleteGetMaxResult {
    public static void main(String[] args) {
        System.out.println("最大结果" + getMaxResult1(new int[]{3,1,5,8,2,10,9, 1, 6, 2,2,2}));
    }

    public static int getMaxResult(int[] array) {
        int length = array.length;
        int sum = 0;
        while (length > 0) {
            if (length == 1) {
                sum += 1;
            } else if (length == 2) {
                if (array[0] > array[1]) {
                    sum += array[0];
                } else {
                    sum += array[1];
                }
            } else {
                int min = array[1];
                int index = -1;
                for (int i = 1; i < length - 1; i++) {
                    if (min >= array[i]) {
                        min = array[i];
                        index = i;
                    }
                }
                sum += array[index - 1] * array[index + 1];

                for (int i = index; i < length - 1; i++) {
                    array[i] = array[i + 1];
                }
            }
            length--;
        }
        return sum;
    }

    public static int getMaxResult1(int[] array) {
        int length = array.length;
        int[] resultArray = new int[length];
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                resultArray[i] = array[i + 1];
            } else if (i == length - 1) {
                resultArray[i] = array[i - 1];
            } else {
                resultArray[i] = array[i - 1] * array[i + 1];
            }
        }
        int sum = 0;
        while (length > 0) {
            if (length == 1) {
                return sum + 1;
            }

            int singleMax = resultArray[0];
            int singleIndex = 0;
            for (int i = 0; i < length; i++) {
                if (singleMax < resultArray[i] || (singleMax == resultArray[i] && array[i] < array[singleIndex])) {
                    singleMax = resultArray[i];
                    singleIndex = i;
                }
            }

            sum += singleMax;

            if (singleIndex == 0) {
                if (length == 2) {
                    resultArray[1] = 1;
                } else {
                    resultArray[1] = array[2];
                }
                for (int i = singleIndex; i < length - 1; i++) {
                    resultArray[i] = resultArray[i + 1];
                }
            } else if (singleIndex == length - 1) {
                if (length > 2) {
                    resultArray[singleIndex - 1] = array[singleIndex - 2];
                } else {
                    resultArray[singleIndex - 1] = 1;
                }
            } else {
                for (int i = singleIndex; i < length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[length - 1] = 1;
                if (singleIndex - 2 < 0) {
                    resultArray[singleIndex - 1] = array[singleIndex];
                } else {
                    resultArray[singleIndex - 1] = array[singleIndex] * array[singleIndex - 2];
                }
                resultArray[singleIndex + 1] = array[singleIndex - 1] * array[singleIndex + 1];
                for (int i = singleIndex; i < length - 1; i++) {
                    resultArray[i] = resultArray[i + 1];
                }
            }

            for (int i = 0; i < length - 1; i++) {
                System.out.print(resultArray[i] + " ");
            }
            System.out.println("  和" + sum);

            length--;
        }

        return sum;
    }
}
