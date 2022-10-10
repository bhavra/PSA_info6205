package com.company;

public class BinaryTree {
    TreeNode root;

    public void addNodeSorted(int val){
        TreeNode newNode = new TreeNode(val);
        if(root == null){
            root = newNode;
        }
        else {
            TreeNode focusNode = root;
            TreeNode parent;
            while(true){
                parent = focusNode;
                if(val < focusNode.val){
                    focusNode = focusNode.left;
                    if(focusNode == null){
                        parent.left = newNode;
                        return;
                    }
                }
                else{
                    focusNode = focusNode.right;
                    if(focusNode == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraversal(TreeNode focusNode){
        if(focusNode!=null){
            inOrderTraversal(focusNode.left);
            System.out.println(focusNode);
            inOrderTraversal(focusNode.right);
        }

    }
}
