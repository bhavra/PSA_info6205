package com.company;
import java.util.*;

public class Question3 {
//Binary Tree Level order Traversal
    private class TreeNode {
        int value;
        TreeNode rightNode;
        TreeNode leftNode;
        TreeNode() {}
        TreeNode(int value) {
            this.value = value;
        }
        TreeNode(int value, TreeNode leftNode, TreeNode rightNode) {
            this.value = value;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
    }

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelOrder( root, 0 );
        return result;
    }

    public void levelOrder(TreeNode root, int level){
        if (root == null) return;
        if (result.size() < level+1)
        result.add(new ArrayList<>());
        result.get(level).add(root.value);
        levelOrder(root.leftNode, level+1);
        levelOrder(root.rightNode, level+1);
    }

}
