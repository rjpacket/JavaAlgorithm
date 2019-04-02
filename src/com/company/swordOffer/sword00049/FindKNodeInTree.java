package com.company.swordOffer.sword00049;

import com.company.bean.TreeNode;

/**
 * 在二叉搜索树查找第K个节点
 */
public class FindKNodeInTree {
    public TreeNode findK(TreeNode root, int K){
        int[] count = new int[1];
        count[0] = K;
        return findKCore(root, count);
    }

    private TreeNode findKCore(TreeNode root, int[] count) {
        TreeNode target = null;
        if(root.left != null){
            target = findKCore(root.left, count);
        }
        if(target == null && count[0] == 1){
            return root;
        }else{
            count[0]--;
        }
        if(target == null && root.right != null){
            target = findKCore(root.right, count);
        }
        return target;
    }

    public static void main(String[] args) {
        TreeNode root       = new TreeNode(5);
        root.left           = new TreeNode(3);
        root.right          = new TreeNode(7);
        root.left.left      = new TreeNode(2);
        root.left.right     = new TreeNode(4);
        root.right.left     = new TreeNode(6);
        root.right.right    = new TreeNode(8);

        FindKNodeInTree findKNodeInTree = new FindKNodeInTree();
        TreeNode k = findKNodeInTree.findK(root, 3);
        System.out.println(k.value);
    }
}
