package com.company.swordOffer.sword00020;

import java.util.Stack;

/**
 * 判断一个序列是不是一个入栈序列的出栈序列
 * <p>
 * 如：入栈序列1, 2, 3, 4, 5
 * 出栈序列4, 3, 5, 2, 1
 */
public class StackPopOrder {

    public boolean isPopOrder(int[] push, int[] pop) {
        Stack<Integer> stack = new Stack<>();
        int position = 0;
        for (int i = 0; i < pop.length; i++) {
            if (!stack.empty() && pop[i] == stack.peek()) {
                stack.pop();
            } else {
                if (position == push.length) {
                    return false;
                }
                do {
                    stack.push(push[position++]);
                } while (position != push.length && pop[i] != stack.peek());
                if (pop[i] == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StackPopOrder stackPopOrder = new StackPopOrder();
        stackPopOrder.isPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 2, 1});
    }
}
