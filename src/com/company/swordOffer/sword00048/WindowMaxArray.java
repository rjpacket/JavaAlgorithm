package com.company.swordOffer.sword00048;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}
 */
public class WindowMaxArray {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList<>(0);
        if (num == null || num.length < 1 || num.length < size || size < 1) {
            return result;
        }
        //定义双端队列
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < num.length; i++) {

            while (!queue.isEmpty() && num[queue.peekLast()] <= num[i]) {
                queue.pollLast();
            }
            queue.addLast(i);
            //删除队头失效的最大值
            if (i - size >= queue.peekFirst()) {
                queue.pollFirst();
            }
            if (i >= size - 1) {
                result.add(num[queue.peekFirst()]);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        WindowMaxArray windowMaxArray = new WindowMaxArray();
        ArrayList<Integer> integers = windowMaxArray.maxInWindows(new int[]{2, 3, 4, 2, 6, 2, 5, 1}, 3);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
