package com.company;

public class findParent {
    public static void populateParent(Node node){
        if(node == null)
            return;
        if(node.left!=null || node.right!=null) {
            System.out.println(node.data);
            populateParent(node.left);
            populateParent(node.right);
        }
    }
}
