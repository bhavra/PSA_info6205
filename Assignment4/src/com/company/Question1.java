package com.company;
/*
Convert Sorted List to Binary Search Tree
 (https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/Links)
 */

public class Question1 {
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
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
    class Solution {
        public TreeNode sortedListToBST(ListNode head) {
            int length=1;
            ListNode temp=head;
            if(head == null)
                return null;
            while( temp.next!= null){
                temp=temp.next;
                length++;
            }
            int [] bst = new int[length];
            for(int i=0;i<length;i++){
                bst[i]=head.val;
                head=head.next;
            }
            return getBST(bst,0,length-1);
        }
        public TreeNode getBST(int [] bst,int start,int end){
            if(start > end) return null;
            int mid=(start+end)/2;
            TreeNode node= new TreeNode(bst[mid]);
            node.left=getBST(bst,start,mid-1);
            node.right=getBST(bst,mid+1,end);
            return node;
        }
    }
}
