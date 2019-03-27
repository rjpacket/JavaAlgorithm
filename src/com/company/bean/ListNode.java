package com.company.bean;

public class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int x) {
        value = x;
    }

    public ListNode(int x, ListNode next) {
        value = x;
        this.next = next;
    }
}