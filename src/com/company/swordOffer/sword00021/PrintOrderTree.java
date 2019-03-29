package com.company.swordOffer.sword00021;

import com.company.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 按照从左到右的顺序打印二叉树
 */
public class PrintOrderTree {

    public void print(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode cur = null;
        while (queue.size() != 0){
            cur = queue.poll();
            System.out.println(cur.value);
            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.right != null){
                queue.add(cur.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root       = new TreeNode(5);
        root.left           = new TreeNode(6);
        root.right          = new TreeNode(8);
        root.left.left      = new TreeNode(3);
        root.left.right     = new TreeNode(2);
        root.right.left     = new TreeNode(4);
        root.right.right    = new TreeNode(9);

        PrintOrderTree printOrderTree = new PrintOrderTree();
        printOrderTree.print(root);
    }
}
