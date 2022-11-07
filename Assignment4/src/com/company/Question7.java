package com.company;
//Inorder Successor in BST
public class Question7 {
    //Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
            return find(null, root, p);
        }
        public TreeNode find(TreeNode parent, TreeNode root, TreeNode p){
            if (root == null) return parent;
            if (p.val < root.val) return find(root, root.left, p);
            return find(parent, root.right, p);
        }
    }
}
