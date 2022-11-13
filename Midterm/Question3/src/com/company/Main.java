package com.company;

public class Main {
    public static void main(String[] args) {
        printVals.BinaryTree tree = new printVals.BinaryTree();
        int k1 = 10, k2 = 25;
        tree.root = new printVals.Node(30);
        tree.root.left = new printVals.Node(7);
        tree.root.right = new printVals.Node(25);
        tree.root.left.left = new printVals.Node(1);
        tree.root.left.right = new printVals.Node(15);

        tree.Print(printVals.BinaryTree.root, k1, k2);
    }
}
