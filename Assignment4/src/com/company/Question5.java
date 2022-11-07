package com.company;
import java.util.*;

public class Question5 {
    
      //Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class BSTIterator {
        TreeNode root;
        TreeNode current;
        Stack<TreeNode> st = new Stack<>();
        public BSTIterator(TreeNode root) {
            this.root = root;
            current = findLeft(root);
        }

        public int next() {
            int val = -1;
            if(current != null)
                val = current.val;
            else
                return -1;

            if(current.right != null)
                current = findLeft(current.right);
            else if(!st.isEmpty())
                current = st.pop();
            else
                current = null;
            // System.out.println("next: stack is: "+st);
            return val;
        }
        public TreeNode findLeft(TreeNode node) {

            if(node == null)
                return null;

            if(node.left != null){
                TreeNode next = node.left;
                st.push(node);
                return findLeft(next);
            }
            else
                return node;

        }
        public boolean hasNext() {
            return current != null;
        }
    }

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
}
