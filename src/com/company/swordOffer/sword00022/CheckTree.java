package com.company.swordOffer.sword00022;

import com.company.bean.TreeNode;

/**
 * 判断一个数组是不是一个二叉搜索树的后序遍历结果
 *
 * 二叉搜索树的特征：
 * 所有左子树小于根节点
 * 所有右子树大于根节点
 */
public class CheckTree {

    public boolean checkTree(int[] array, int start, int end){
        //只有两个节点一定是二叉搜索树
        if(end-start<=1){
            return true;
        }
        int i = start;
        for (; i < end; i++) {
            if(array[i] > array[end]) break;
        }
        int j = i;
        for (; j < end; j++) {
            if(array[j] < array[end]) return false;
        }
        boolean left = true;
        //如果存在左子树
        if(i > 0){
            left = checkTree(array, start, i - 1);
        }
        boolean right = true;
        //如果存在右子树
        if(i < end){
            right = checkTree(array, i, end - 1);
        }
        return left && right;
    }

    public static void main(String[] args) {
        CheckTree checkTree = new CheckTree();
        System.out.println(checkTree.checkTree(new int[]{2,4,9,6,8,7,5}, 0, 6));
    }
}
