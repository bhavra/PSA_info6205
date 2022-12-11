package com.company;
import java.util.*;
//Remove Minimum Parenthesis to make th input valid
public class Question3 {
    public static String minRemoveValidParanthesis(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(')
                stack.push(sb.length());
            else if(ch==')' && !stack.isEmpty())
                stack.pop();
            else if(ch==')' && stack.isEmpty())
                continue;
            sb.append(ch);
        }
        while(!stack.isEmpty())
            sb.deleteCharAt(stack.pop());
        return sb.toString();
    }
    public static void main(String[] args){
        String input = "((())()";
        String output = minRemoveValidParanthesis(input);
        int numDel = input.length()-output.length();
        System.out.println("Input -> " +input);
        System.out.println("Output -> " +output);
        System.out.println("Number of deletions -> " +numDel);
    }
}
