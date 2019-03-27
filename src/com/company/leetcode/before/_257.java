package com.company.leetcode.before;

import com.company.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _257 {
    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        find(root, result, "");
        return result;
    }

    private void find(TreeNode root, List<String> result, String s) {
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            s += root.value;
            result.add(s);
        }else{
            s += root.value + "->";
        }
        if(root.left != null){
            find(root.left, result, s);
        }
        if(root.right != null){
            find(root.right, result, s);
        }
    }
}
