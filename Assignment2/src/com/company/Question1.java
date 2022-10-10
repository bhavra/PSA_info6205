package com.company;

public  class Question1 {

    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null || t2 == null){
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(2);
        tree1.root.left.left = new TreeNode(3);
        tree1.root.left.right = new TreeNode(4);
        tree1.root.right.left = new TreeNode(4);
        tree1.root.right.right = new TreeNode(3);
        if(isSymmetric(tree1.root)){
            System.out.println("Tree1 is Symmetric");
        }
        else{
            System.out.println("Tree1 is not symmetric");
        }
//        tree1.inOrderTraversal(tree1.root);
    }
}
