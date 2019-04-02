package com.company.swordOffer.sword00046;

import com.company.bean.TreeNode;

import java.util.Stack;

/**
 * 之字形打印二叉树
 */
public class ZhiPrintTreeNode {
    public void print(TreeNode root){
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.empty() || !stack2.empty()){
            if(!stack1.empty()){
                while (!stack1.empty()){
                    TreeNode pop = stack1.pop();
                    System.out.println(pop.value);
                    if(pop.right != null){
                        stack2.push(pop.right);
                    }
                    if(pop.left != null){
                        stack2.push(pop.left);
                    }
                }
            }else if(!stack2.empty()){
                while (!stack2.empty()){
                    TreeNode pop = stack2.pop();
                    System.out.println(pop.value);
                    if(pop.left != null){
                        stack1.push(pop.left);
                    }
                    if(pop.right != null){
                        stack1.push(pop.right);
                    }
                }
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

        ZhiPrintTreeNode zhiPrintTreeNode = new ZhiPrintTreeNode();
        zhiPrintTreeNode.print(root);
    }
}
