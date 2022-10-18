package com.company;
import java.util.*;
/*Given two integers n and k, return an array of all the integers of length n where the difference between every
two consecutive digits is k. You may return the answer in any order.
Note that the integers should not have leading zeros. Integers as 02 and 043 are not allowed.
 */

public class Question5 {
    List<Integer> res = new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        for(int i=1;i<=9;i++){
            helper(i,i,k,n-1);
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    public void helper(int i,int num, int k, int n){
        if(n==0){
            if(!res.contains(num))
                res.add(num);
            return;
        }
        if(i-k>=0){
            helper(i-k,num*10+i-k,k,n-1);
        }
        if(i+k<=9){
            helper(i+k,num*10+i+k,k,n-1);
        }
    }
}
