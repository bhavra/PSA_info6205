package com.company;
import java.util.*;
/*
Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
 */

public class Question6 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res =  new ArrayList<>();
        subSet(0,nums,res,new ArrayList<Integer>());
        return res;
    }
    public void subSet(int ind,int[] nums,List<List<Integer>> res,List<Integer>ds){
        if(ind == nums.length){
            res.add(new ArrayList<Integer>(ds));
            return;
        }
        subSet(ind+1,nums,res,ds);
        ds.add(nums[ind]);
        subSet(ind+1,nums,res,ds);
        ds.remove(ds.size()-1);
        return;
    }
}
