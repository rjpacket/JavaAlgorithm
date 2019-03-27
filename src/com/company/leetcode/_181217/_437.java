package com.company.leetcode._181217;

import com.company.bean.TreeNode;

public class _437 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(-3);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(11);
        TreeNode t7 = new TreeNode(3);
        TreeNode t8 = new TreeNode(-2);
        TreeNode t9 = new TreeNode(1);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t4.left = t7;
        t4.right = t8;

        t3.right = t6;

        t5.right = t9;

        System.out.println(pathSum(t1, 8));
    }

    public static int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return pathRemainSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public static int pathRemainSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        if (root.value == sum) {
            return 1;
        }
        return pathRemainSum(root.left, sum - root.value) + pathRemainSum(root.right, sum - root.value);
    }
}
