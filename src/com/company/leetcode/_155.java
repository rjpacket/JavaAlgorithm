package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 * <p>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 */
public class _155 {
    class MinStack {
        private List<Integer> stack = new ArrayList<>();
        private List<Integer> mins = new ArrayList<>();
        private int min;

        /**
         * initialize your data structure here.
         */
        public MinStack() {

        }

        public void push(int x) {
            if (stack.size() == 0) {
                min = x;
            } else {
                if (x < min) {
                    min = x;
                }
            }
            mins.add(min);
            stack.add(x);
        }

        public void pop() {
            if (stack.size() > 0) {
                stack.remove(stack.size() - 1);
                mins.remove(mins.size() - 1);
                if (mins.size() > 1) {
                    min = mins.get(mins.size() - 1);
                }
            }
        }

        public int top() {
            if (stack.size() > 0) {
                return stack.get(stack.size() - 1);
            }
            return 0;
        }

        public int getMin() {
            return mins.get(mins.size() - 1);
        }
    }

    public static void main(String[] args) {

    }
}
