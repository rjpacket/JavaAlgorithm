package com.company.swordOffer.sword00011;

import com.company.bean.ListNode;

/**
 * 在O(1)的时间复杂度内删除单链表的节点
 */
public class DeleteNode {
    public void deleteNode(ListNode head, ListNode del){
        if(head == null || del == null){
            return;
        }
        if(head == del){
            head = null;
        }else{
            if(del.next == null){
                ListNode temp = head;
                while (temp.next != del){
                    temp = temp.next;
                }
                temp.next = null;
            }else{
                del.value = del.next.value;
                del.next = del.next.next;
            }
        }
    }

    public static void main(String[] args) {

    }
}
