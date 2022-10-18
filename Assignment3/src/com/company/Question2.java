package com.company;
import java.util.*;
//Given an array nums of distinct integers, return all the possible permutations.
public class Question2 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int[] grid = new int[nums.length];
        List<Integer> temp = new ArrayList<>();
        recursion(nums, grid, temp);
        return result;
    }
    public void recursion(int[] num, int[] grid, List<Integer> temp) {
        if (temp.size() == num.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (grid[i] == 0) {
                grid[i] = 1;
                int idx = temp.size();
                temp.add(num[i]);
                recursion(num, grid, temp);
                temp.remove(idx);
                grid[i] = 0;
            }
        }
    }
}
