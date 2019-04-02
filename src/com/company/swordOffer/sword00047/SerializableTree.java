package com.company.swordOffer.sword00047;

import com.company.bean.NodeUtils;
import com.company.bean.TreeNode;

/**
 * 序列化二叉树
 */
public class SerializableTree {
    public String serial(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialCore(root, sb);
        return sb.toString();
    }

    private void serialCore(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }
        sb.append(root.value).append(",");
        serialCore(root.left, sb);
        serialCore(root.right, sb);
    }

    private int index = 0;

    public TreeNode deSerial(String str) {
        if(str == null || str.length() == 0){
            return null;
        }
        String[] trees = str.split(",");
        return deSerialCore(trees);
    }

    private TreeNode deSerialCore(String[] trees) {
        if (!trees[index].contains("#")) {
            TreeNode root = new TreeNode(Integer.parseInt(trees[index++]));
            root.left = deSerialCore(trees);
            root.right = deSerialCore(trees);
            return root;
        } else{
            index++;
            return null;
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

        SerializableTree serializableTree = new SerializableTree();
        String serial = serializableTree.serial(root);
        System.out.println(serial);

        TreeNode treeNode = serializableTree.deSerial("5,6,3,#,#,2,#,#,8,4,#,#,9,#,#,");
        NodeUtils.printTree(treeNode);
    }
}
