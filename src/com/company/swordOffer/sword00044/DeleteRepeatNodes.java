package com.company.swordOffer.sword00044;

import com.company.bean.ListNode;
import com.company.bean.NodeUtils;

/**
 * 删除排序链表的重复节点
 */
public class DeleteRepeatNodes {
    public ListNode delete(ListNode head){
        ListNode temp = head;
        while (head != null && head.next != null){
            int value = head.value;
            if(value == head.next.value){
                while (head.next != null && head.next.value == value){
                    head.next = head.next.next;
                }
            }else{
                head = head.next;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        DeleteRepeatNodes deleteRepeatNodes = new DeleteRepeatNodes();
        ListNode delete = deleteRepeatNodes.delete(NodeUtils.buildNodes(new int[]{1, 1, 2, 2, 2, 3, 4, 5, 6}));
        NodeUtils.printNode(delete);
    }
}
