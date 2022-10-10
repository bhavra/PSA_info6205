package com.company;
import java.util.*;

public class Question3 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        if(root == null)
            return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i<size; i++){
                TreeNode current = queue.poll();
                if(i==0)
                    result.add(current.val);
                if(current.right!=null)
                    queue.offer(current.right);
                if(current.left!=null)
                    queue.offer(current.left);
            }
        }
        return result;
    }
}
