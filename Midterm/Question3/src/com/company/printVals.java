package com.company;

public class printVals {
    static class Node {
        int val;
        Node left, right;

        Node(int d) {
            val = d;
            left = right = null;
        }
    }

    static class BinaryTree {
        static Node root;
        void Print(Node node, int low, int high) {
            if (node == null) {
                return;
            }
            if (low < node.val) {
                Print(node.left, low, high);
            }
            if (low <= node.val && high >= node.val) {
                System.out.print(node.val + " ");
            }
            Print(node.right, low, high);
        }
    }
}
