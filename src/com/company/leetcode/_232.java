package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _232 {

    public static void main(String[] args) {

    }

    public static class MyQueue {
        private List<Integer> list = new ArrayList<>();

        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            list.add(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(list.size() > 0){
                return list.remove(0);
            }
            return -1;
        }

        /** Get the front element. */
        public int peek() {
            if(list.size() > 0){
                return list.get(0);
            }
            return -1;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return list.size() == 0;
        }
    }
}
