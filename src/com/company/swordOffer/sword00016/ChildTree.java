package com.company.swordOffer.sword00016;

import com.company.bean.TreeNode;

public class ChildTree {

    public boolean hasSubTree(TreeNode root, TreeNode subTree){
        if(root == null || subTree == null){
            return false;
        }
        boolean flag = false;
        if(root.value == subTree.value){
            flag = checkSubTree(root, subTree);
        }
        if(!flag){
            flag = hasSubTree(root.left, subTree);
        }
        if(!flag){
            flag = hasSubTree(root.right, subTree);
        }
        return flag;
    }

    private boolean checkSubTree(TreeNode root, TreeNode subTree) {
        if(root == null && subTree != null){
            return false;
        }
        if(subTree == null){
            return true;
        }
        return checkSubTree(root.left, subTree.left) && checkSubTree(root.right, subTree.right);
    }

    public static void main(String[] args) {

    }
}
