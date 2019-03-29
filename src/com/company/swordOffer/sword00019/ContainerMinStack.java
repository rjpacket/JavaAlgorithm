package com.company.swordOffer.sword00019;

import java.util.Stack;

/**
 * 构造一个能快速找出最小值的栈，即带有min函数的栈
 */
public class ContainerMinStack {

    private Stack<Integer> allStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int number){
        allStack.push(number);
        if(minStack.empty()){
            minStack.push(number);
        }else{
            Integer peek = minStack.peek();
            if(number < peek){
                minStack.pop();
                minStack.push(number);
            }
        }
    }

    public void pop(){
        Integer pop = allStack.pop();
        if(pop == minStack.peek()){
            minStack.pop();
        }
    }

    public int getMin() throws Exception {
        if(minStack.empty()){
            throw new Exception("没有内容");
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        try {
            ContainerMinStack minStack = new ContainerMinStack();
            minStack.push(2);
            minStack.push(3);
            minStack.push(4);
            minStack.push(5);
            minStack.push(1);
            minStack.push(6);
            minStack.push(8);
            minStack.push(9);
            System.out.println(minStack.getMin());
        }catch (Exception e){

        }
    }
}
