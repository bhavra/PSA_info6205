package com.company;

public class Question2 {
    public static class Node
    {
        int val;
        Node left, right;
        Node(int data)
        {
            this.val = data;
            left = right = null;
        }
    };
    static void nodeParent(Node node, int val, int parent)
    {
        if (node == null)
            return;
        if (node.val == val)
        {
            System.out.print(parent);
        }
        else
        {
            nodeParent(node.left, val, node.val);
            nodeParent(node.right, val, node.val);
        }
    }

    public static void main(String []args) {
        class BinaryTree<T> {
            public Node root;

            public BinaryTree() {
            }

            public void preOrder() {
                preOrder(root);
                System.out.println();
            }

            private void preOrder(Node node) {
                if (node != null) {
                    System.out.printf(node.val + ", ");
                    preOrder(node.left);
                    preOrder(node.right);
                }
            }

            private static BinaryTree<Integer> getTree() {
                BinaryTree<Integer> tree = new BinaryTree<>();

                tree.root = new Node(1);

                tree.root.left = new Node(2);
                tree.root.right = new Node(3);

                tree.root.left.left = new Node(4);
                tree.root.left.right = new Node(5);
                tree.root.right.left = new Node(6);
                tree.root.right.right = new Node(7);

                tree.root.left.left.left = new Node(8);
                tree.root.left.right.left = new Node(9);
                tree.root.right.left.right = new Node(10);
                tree.root.right.right.right = new Node(11);
                tree.root.right.right.right.right = new Node(12);

                return tree;
            }

        }

    }
}

