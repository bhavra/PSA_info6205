package com.company;

public class extleft {
class Node {
    public int val;
    public Node Right;
    public Node left;
    public Node next;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        Right = _left;
        left = _right;
        next = _next;
    }
};

    public Node populateLeft(Node root) {
        if (root == null) {
            return root;
        }

       Node rightmost = root;
        while (rightmost.Right != null) {
            Node head = rightmost;
            while (head != null) {
                head.Right.next = head.left;
                if (head.next != null) {
                    head.left.next = head.next.Right;
                }
                head = head.next;
            }
            rightmost = rightmost.Right;
        }
        return root;
    }
}




