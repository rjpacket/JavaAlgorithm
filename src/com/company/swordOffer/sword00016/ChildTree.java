package com.company.swordOffer.sword00016;

import com.company.bean.TreeNode;

/**
 * 判断是否是子树
 */
public class ChildTree {

    public boolean hasSubTree(TreeNode root, TreeNode subTree) {
        if (root == null || subTree == null) {
            return false;
        }
        boolean flag = false;
        if (root.value == subTree.value) {
            flag = checkSubTree(root, subTree);
        }
        if (!flag) {
            flag = hasSubTree(root.left, subTree);
        }
        if (!flag) {
            flag = hasSubTree(root.right, subTree);
        }
        return flag;
    }

    private boolean checkSubTree(TreeNode root, TreeNode subTree) {
        //如果root已经遍历完了但是subTree还是不为空，说明子树高度比根树大，false
        if (root == null && subTree != null) {
            return false;
        }
        //如果子树遍历完了，不管root是否为空，返回true
        if (subTree == null) {
            return true;
        }
        //否则分别遍历左右子树，&& 联接
        return checkSubTree(root.left, subTree.left) && checkSubTree(root.right, subTree.right);
    }

    public static void main(String[] args) {
        TreeNode root       = new TreeNode(5);
        root.left           = new TreeNode(6);
        TreeNode child      = new TreeNode(100);
        root.right          = new TreeNode(8);
        root.left.left      = new TreeNode(3);
        root.left.right     = new TreeNode(2);
        root.right.left     = new TreeNode(4);
        root.right.right    = new TreeNode(9);

        ChildTree childTree = new ChildTree();
        System.out.println(childTree.hasSubTree(root, child));
    }
}
