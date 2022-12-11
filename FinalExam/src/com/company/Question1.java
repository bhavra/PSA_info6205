package com.company;
import java.util.*;
//Group anagrams together
public class Question1 {
    public static List<List<String>> groupAnagramsTogether(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted_string = String.valueOf(c);
            List<String> list = map.getOrDefault(sorted_string, new ArrayList<>());
            list.add(s);
            map.put(sorted_string, list);
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> list : map.values()){
            Collections.sort(list);
            result.add(list);
        }
        return result;
    }
    public static void main(String[] args) {
        String[] input ={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagramsTogether(input));
    }
}