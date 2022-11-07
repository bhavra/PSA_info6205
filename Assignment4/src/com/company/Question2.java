package com.company;
/*

 */

public class Question2 {
// Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
        class Solution {
        private Node last;
        public Node treeToDoublyList(Node root) {
            Node temp = new Node(-1001);
            last = temp;
            inorder(root);
            if(temp.right == null) return null;
            temp.right.left = last;
            last.right = temp.right;
            return temp.right;
        }
        private void inorder(Node root)
        {
            if(root == null) return;
            inorder(root.left);
            last.right = root;
            root.left = last;
            last = root;
            inorder(root.right);
        }
    }
}
