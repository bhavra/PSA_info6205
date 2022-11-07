package com.company;
import java.util.*;

//Serialize and Deserialize BST
public class Question6 {

     //* Definition for a binary tree node.
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return null;
            }

            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                TreeNode n = q.remove();
                sb.append(n.val).append(',');
                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);
            }
            sb.setLength(sb.length()-1); // remove last ','
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null) {
                return null;
            }

            String[] vals = data.split(",");
            TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
            for (int i=1; i<vals.length; i++) {
                add(root, Integer.parseInt(vals[i]));
            }
            return root;
        }
        private static void add(TreeNode root, int val) {
            TreeNode cur = root;
            TreeNode parent = null;
            while (cur != null) {
                parent = cur;
                cur = (val <= cur.val) ? cur.left : cur.right;
            }
            if (val <= parent.val) {
                parent.left = new TreeNode(val);
            } else {
                parent.right = new TreeNode(val);
            }
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;

}
