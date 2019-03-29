package com.company.swordOffer.sword00017;

import com.company.bean.NodeUtils;
import com.company.bean.TreeNode;

/**
 * 二叉树的镜像
 */
public class MirrorTree {

    public void mirror(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        mirror(root.left);
        mirror(root.right);
    }

    public static void main(String[] args) {
        TreeNode root       = new TreeNode(5);
        root.left           = new TreeNode(6);
        root.right          = new TreeNode(8);
        root.left.left      = new TreeNode(3);
        root.left.right     = new TreeNode(2);
        root.right.left     = new TreeNode(4);
        root.right.right    = new TreeNode(9);

        MirrorTree mirrorTree = new MirrorTree();
        mirrorTree.mirror(root);

        NodeUtils.printTree(root);
    }
}
