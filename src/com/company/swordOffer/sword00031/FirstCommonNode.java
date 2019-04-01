package com.company.swordOffer.sword00031;

import com.company.bean.ListNode;
import com.company.bean.NodeUtils;


/**
 * 找出两个链表的第一个公共节点
 */
public class FirstCommonNode {
    public ListNode findNode(ListNode node1, ListNode node2){
        if(node1 == null || node2 == null){
            return null;
        }
        int node1Len = getNodeLength(node1);
        int node2Len = getNodeLength(node2);

        int dis;
        ListNode fast;
        ListNode slow;
        if(node1Len > node2Len){
            dis = node1Len - node2Len;
            fast = node1;
            slow = node2;
        }else{
            dis = node2Len - node1Len;
            fast = node2;
            slow = node1;
        }
        while (dis > 0){
            fast = fast.next;
            dis--;
        }
        while (fast != null && slow != null && fast.value != slow.value){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }

    private int getNodeLength(ListNode node) {
        int count = 0;
        while (node != null){
            count++;
            node = node.next;
        }
        return count;
    }

    public static void main(String[] args) {
        FirstCommonNode firstCommonNode = new FirstCommonNode();
        ListNode node = firstCommonNode.findNode(NodeUtils.buildNodes(new int[]{1, 2, 3, 4, 5, 6}), NodeUtils.buildNodes(new int[]{7, 8, 4, 5, 6}));
        System.out.println(node.value);
    }
}
