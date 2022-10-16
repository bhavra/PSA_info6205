package com.company;

public class Question1 {
    //rotate the array to the right by k steps
    public static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        rotate(arr,2);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
