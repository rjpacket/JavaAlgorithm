package com.company.swordOffer.sword00033;

import com.company.bean.NodeUtils;
import com.company.bean.TreeNode;

/**
 * 判断是不是平衡二叉树
 *
 * 注意，需要遍历判断左右子节点是不是平衡二叉树
 */
public class BalanceTree {
    public boolean isBalance(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDeep = NodeUtils.getDeep(root.left);
        int rightDeep = NodeUtils.getDeep(root.right);
        if (Math.abs(leftDeep - rightDeep) > 1) {
            return false;
        }
        return isBalance(root.left) && isBalance(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(9);
        root.right.left.left = new TreeNode(4);
        root.right.left.left.left = new TreeNode(4);

        BalanceTree balanceTree = new BalanceTree();
        boolean balance = balanceTree.isBalance(root);
        System.out.println(balance);
    }
}
