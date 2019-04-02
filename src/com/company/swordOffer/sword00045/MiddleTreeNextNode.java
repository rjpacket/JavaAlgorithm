package com.company.swordOffer.sword00045;

import com.company.bean.TreeNode;

/**
 * 二叉树中序遍历的下一节点
 */
public class MiddleTreeNextNode {
    public TreeNode next(TreeNode pNode){
        if(pNode == null){
            return null;
        }
        TreeNode next = null;
        if(pNode.right != null){
            TreeNode pRight = pNode.right;
            while (pRight.left != null){
                pRight = pRight.left;
            }
            next = pRight;
        }else if(pNode.next != null){
            TreeNode pCur = pNode;
            TreeNode parent = pNode.next;
            while (parent != null && pCur != parent.left){
                pCur = parent;
                parent = parent.next;
            }
            next = parent;
        }
        return next;
    }
}
