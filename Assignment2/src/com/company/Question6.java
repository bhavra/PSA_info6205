package com.company;
import java.util.*;

public class Question6 {
    public int widthOfBinaryTree(TreeNode root) {
        Deque<TreeNode> queue=new ArrayDeque<>();
        root.val=0;
        queue.add(root);
        return bfs(queue);
    }

    public int bfs(Deque<TreeNode> queue){
        int maxWidth = 1;
        while(!queue.isEmpty()){
            int size=queue.size();
            int left = queue.peek().val;
            int right = left;
            for(int i=0;i<size;i++){
                TreeNode node=queue.removeFirst();

                if(node.left!=null){
                    node.left.val = node.val * 2 - 1;
                    queue.add(node.left);
                }
                if(node.right!=null){
                    node.right.val = node.val * 2;
                    queue.add(node.right);
                }
                if(i==size-1)
                    right=node.val;
            }
            maxWidth=Math.max(maxWidth,right-left+1);
        }
        return maxWidth;
    }
}
