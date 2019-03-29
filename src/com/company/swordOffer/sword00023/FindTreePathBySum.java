package com.company.swordOffer.sword00023;

import com.company.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 查找二叉树中所有和为target的路径
 */
public class FindTreePathBySum {

    public List<List<Integer>> findTree(TreeNode root, int target) {
        if(root == null){
            return null;
        }
        List<Integer> curList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        findTreePath(root, target, 0, curList, result);
        return result;
    }

    private void findTreePath(TreeNode root, int target, int curSum, List<Integer> curList, List<List<Integer>> result) {
        curSum += root.value;
        if(root.left == null && root.right == null){
            if(curSum == target){
                curList.add(root.value);
                result.add(new ArrayList<>(curList));
                curList.remove(curList.size() - 1);
            }
        }else{
            curList.add(root.value);
            findTreePath(root.left, target, curSum, curList, result);
            findTreePath(root.right, target, curSum, curList, result);
            curList.remove(curList.size() - 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root       = new TreeNode(5);
        root.left           = new TreeNode(6);
        root.right          = new TreeNode(8);
        root.left.left      = new TreeNode(3);
        root.left.right     = new TreeNode(2);
        root.right.left     = new TreeNode(1);
        root.right.right    = new TreeNode(9);

        FindTreePathBySum findTreePathBySum = new FindTreePathBySum();
        List<List<Integer>> tree = findTreePathBySum.findTree(root, 14);
        for (List<Integer> integers : tree) {
            for (Integer integer : integers) {
                System.out.print(integer + "-");
            }
            System.out.println();
        }
    }
}
