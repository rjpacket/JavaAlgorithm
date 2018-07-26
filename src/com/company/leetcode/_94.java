package com.company.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [1,3,2]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * Created by An on 2018/4/23.
 */
public class _94 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        List<Integer> list = inorderTraversal(root);
        for (Integer integer : list) {
            System.out.println("------------" + integer);
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        LinkedList<TreeNode> rootNodes = new LinkedList<>();
        rootNodes.add(root);
        while (rootNodes.size() != 0) {
            if (root.left != null) {
                root = root.left;
                rootNodes.add(root);
                continue;
            } else {
                root = rootNodes.removeLast();
                root.left = null;
                list.add(root.val);
            }
            if (root.right != null) {
                root = root.right;
                if (root.left == null && root.right == null) {
                    list.add(root.val);
                } else {
                    rootNodes.add(root);
                }
            }
        }
        return list;
    }
}
