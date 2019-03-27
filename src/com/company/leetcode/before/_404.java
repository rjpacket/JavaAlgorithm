package com.company.leetcode.before;

import com.company.bean.TreeNode;

public class _404 {

    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left != null && root.left.left == null && root.left.right == null){
            return root.left.value + sumOfLeftLeaves(root.right);
        }else{
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }
}
