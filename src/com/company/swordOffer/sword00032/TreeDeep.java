package com.company.swordOffer.sword00032;

import com.company.bean.TreeNode;

/**
 * 二叉树的深度
 */
public class TreeDeep {

    public int measure(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ld = measure(root.left);
        int rd = measure(root.right);
        return ld > rd ? (ld + 1) : (rd + 1);
    }

    public static void main(String[] args) {
        TreeNode root       = new TreeNode(5);
        root.left           = new TreeNode(6);
        root.right          = new TreeNode(8);
        root.left.left      = new TreeNode(3);
        root.left.right     = new TreeNode(2);
        root.right.left     = new TreeNode(4);
        root.right.right    = new TreeNode(9);

        TreeDeep treeDeep = new TreeDeep();
        int measure = treeDeep.measure(root);
        System.out.println(measure);
    }
}
