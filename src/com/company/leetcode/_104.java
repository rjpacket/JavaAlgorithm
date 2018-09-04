package com.company.leetcode;

import com.company.bean.TreeNode;

/**
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 */
public class _104 {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(6);
        n1.left = n2;
        n1.right = n5;
        n2.left = n3;
        n3.right = n4;
        System.out.println(maxDepth(n1));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int deepLeft = 1;
        int deepRight = 1;
        if (root.left != null) {
            deepLeft += maxDepth(root.left);
        }
        if (root.right != null) {
            deepRight += maxDepth(root.right);
        }
        return deepLeft > deepRight ? deepLeft : deepRight;
    }
}
