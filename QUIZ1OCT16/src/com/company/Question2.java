package com.company;

//Given the roots of two binary trees p and q, write a function to check if they are the same or not.
public class Question2 {
    private class TreeNode {
        int value;
        TreeNode rightNode;
        TreeNode leftNode;
        TreeNode() {}
        TreeNode(int value) {
            this.value = value;
        }
        TreeNode(int value, TreeNode leftNode, TreeNode rightNode) {
            this.value = value;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
    }

    public static boolean isIdentical(TreeNode p, TreeNode q){
        if (p == null && q == null)
            return true;
        else if (p == null || q == null || p.value != q.value)
            return false;
        else
            return isIdentical(p.leftNode, q.leftNode) && isIdentical(p.rightNode, q.rightNode);
    }
}
