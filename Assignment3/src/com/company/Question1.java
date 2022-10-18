package com.company;
import java.util.*;
/*Given an array of distinct integers candidates and a target integer target,
return a list of all unique combinations of candidates where the chosen numbers sum to target.
You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times.
Two combinations are unique if the frequency of at least one of the chosen numbers is different.
The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
*/

public class Question1 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> curr = new ArrayList<Integer>();
        permute(candidates,target,0,0,curr);
        return result;
    }
    public void permute(int[] nums,int target,int currSum,int index,ArrayList<Integer> current){
        if(currSum == target){
            result.add(new ArrayList<>(current));
        }
        else{
            for(int i = index ; i < nums.length; i++){
                if(currSum + nums[i]<= target){
                    currSum+=nums[i];
                    current.add(nums[i]);
                    permute(nums,target,currSum,i,current);
                    currSum-= nums[i];
                    current.remove(current.size()-1);
                }
            }
        }
    }
}
