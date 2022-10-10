package com.company;

public class Question2 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        int maxDepth = Math.max(leftMax,rightMax)+1;
        return maxDepth;
    }
}
