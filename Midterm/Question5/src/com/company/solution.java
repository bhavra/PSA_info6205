package com.company;

public  class solution {
    public static void indexOfArray(int[] sortedArr, int[] indexArr){
        for(int i = 0; i<sortedArr.length; i++){
           for(int j=0 ; j<indexArr.length; j++){
               if(indexArr[j] == sortedArr[i]){
                   indexArr[j] = i;
               }
           }
        }

    }
}
