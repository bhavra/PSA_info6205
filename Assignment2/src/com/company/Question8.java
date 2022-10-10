package com.company;
import java.util.*;

public class Question8 {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> leaves = new ArrayList();

        while(!isLeafNode(root, leaves)) {
            ans.add(leaves);
            leaves = new ArrayList();
        }
        ans.add(leaves);
        return ans;
    }
    public static boolean isLeafNode(TreeNode root, List<Integer> leafNodes) {
        if (root == null)
            return false;
        if (root.left==null && root.right==null) {
            leafNodes.add(root.val);
            return true;
        }
        if (isLeafNode(root.left, leafNodes)) {
            root.left = null;
        }
        if (isLeafNode(root.right, leafNodes)) {
            root.right = null;
        }
        return false;
    }
}
