package com.company;
import java.util.*;

public class Question7 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==q) return p;
        List<TreeNode> path_P = new ArrayList<>();
        List<TreeNode> path_q = new ArrayList<>();
        getPath(root,p,path_P);
        getPath(root,q,path_q);

        for(int i=0,j=0;;i++,j++){
            TreeNode a,b;
            a = i<path_P.size() ? path_P.get(i) : null;
            b = j<path_q.size() ? path_q.get(j) : null;
            if(a!=b){
                return path_P.get(i-1);
            }
        }
    }
    private boolean getPath(TreeNode root,TreeNode target,List<TreeNode> temp){
        if(root==null) return false;
        temp.add(root);
        if(root==target) return true;
        if(getPath(root.left,target,temp) || getPath(root.right,target,temp)){
            return true;
        }
        temp.remove(temp.size()-1);
        return false;
    }
}
