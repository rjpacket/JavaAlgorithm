package com.company.swordOffer.sword00005;

import com.company.bean.TreeNode;

/**
 * 重建二叉树
 *
 * 前序 1,2,4,7,3,5,6,8
 * 中序 4,7,2,1,5,3,8,6
 *
 * 1. 头节点就是前序的第一个值，所以 root = 1
 * 2. 然后在中序中找到这个 root 的下标 i ，i左边都是左子树中序{4,7,2}，i右边都是右子树中序{5,3,8,6}
 * 3. 再回到前序数组查看左子树的前序{2,4,7}，右子树的前序{3,5,6,8}
 * 4. 分别对左子树和右子树进行重建，一直到结束条件没有左右子树为止
 */
public class RebuildTree {

    public TreeNode rebuildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == pre[preStart]) {
                root.left = rebuildTree(pre, preStart + 1, preStart + i - inStart, in, inStart, i - 1);
                root.right = rebuildTree(pre, preStart + i - inStart + 1, preEnd, in, i + 1, inEnd);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        RebuildTree rebuildTree = new RebuildTree();
        TreeNode treeNode = rebuildTree.rebuildTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        printNode(treeNode);
    }

    public static void printNode(TreeNode treeNode){
        if(treeNode == null){
            return;
        }
        printNode(treeNode.left);
        System.out.println(treeNode.value);
        printNode(treeNode.right);
    }
}
