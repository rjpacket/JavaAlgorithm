package com.company.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 4, 1, 3, 5};
        bubbleSort2(arr);
    }

    public static int[] bubbleSort(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(" ----->原始数据");

        int exchangeCount = 0;
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                exchangeCount++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    for (int k = 0; k < length; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(" ----->第" + exchangeCount + "次交换");
                } else {
                    System.out.println(" ----->第" + exchangeCount + "次循环");
                }
            }
        }
        return arr;
    }

    /**
     * 后续已经是排序好的直接退出
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort1(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(" ----->优化1原始数据");

        int exchangeCount = 0;
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            boolean isSort = true;
            for (int j = 0; j < length - 1; j++) {
                exchangeCount++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSort = false;

                    for (int k = 0; k < length; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(" ----->第" + exchangeCount + "次交换");
                } else {
                    System.out.println(" ----->第" + exchangeCount + "次循环");
                }
            }
            if (isSort) {
                break;
            }
        }
        return arr;
    }

    /**
     * 每一次发生交换的最后一次把位置往前挪
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort2(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(" ----->优化2原始数据");

        int exchangeCount = 0;
        int length = arr.length;
        int end = length - 1;
        for (int i = 0; i < length - 1; i++) {
            int newEnd = 0;
            for (int j = 0; j < end; j++) {
                exchangeCount++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    newEnd = j + 1;

                    for (int k = 0; k < length; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(" ----->第" + exchangeCount + "次交换");
                } else {
                    System.out.println(" ----->第" + exchangeCount + "次循环");
                }
            }

            end = newEnd;
        }
        return arr;
    }

    public static int[] bubbleJJSort(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(" ----->鸡尾酒原始数据");

        int begin = 0;
        int end = arr.length - 1;
        int exchangeCount = 0;

        while (begin <= end) {

            int newBegin = end;
            int newEnd = begin;

            for (int i = begin; i < end; i++) {
                exchangeCount++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    newEnd = i + 1;

                    for (int k = 0; k < arr.length; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(" ----->第" + exchangeCount + "次交换");
                } else {
                    System.out.println(" ----->第" + exchangeCount + "次循环");
                }
            }

            end = newEnd - 1;

            for (int i = end; i > begin - 1; i--) {
                exchangeCount++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    newBegin = i;

                    for (int k = 0; k < arr.length; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(" ---|-->第" + exchangeCount + "次交换");
                } else {
                    System.out.println(" ---|-->第" + exchangeCount + "次循环");
                }
            }

            begin = newBegin + 1;
        }

        return arr;
    }
}
