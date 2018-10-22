package com.company.leetcode;

import com.company.bean.TreeNode;

public class _226 {

    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
