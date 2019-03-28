package com.company.swordOffer.sword00006;

import java.util.Stack;

/**
 * 两个栈实现队列
 * <p>
 * 1. 第一个栈存储进栈的内容
 * 2. 第二个栈存储从第一个栈出栈的内容
 * 3. 如果第二个栈空的，先把第一个栈出栈存入第二个栈，第二个栈不空直接出栈
 */
public class StackQueue {

    private Stack<String> stackIn = new Stack<>();
    private Stack<String> stackOut = new Stack<>();

    public void add(String str) {
        stackIn.push(str);
    }

    public String get() throws Exception {
        if (stackOut.empty()) {
            if (stackIn.empty()) {
                throw new Exception("没有数据可以获取");
            } else {
                while (!stackIn.empty()) {
                    stackOut.push(stackIn.pop());
                }
            }
        }
        return stackOut.pop();
    }

    public static void main(String[] args) {
        try {
            StackQueue stackQueue = new StackQueue();
            stackQueue.add("1");
            stackQueue.add("11");
            stackQueue.add("111");
            System.out.println(stackQueue.get());
            System.out.println(stackQueue.get());
            System.out.println(stackQueue.get());
        } catch (Exception e) {

        }
    }
}
