package com.company;
//Number of Islands
public class Question2 {
    char[][] TempGrd;
    public int numberOfIslands(char[][] grid) {
        int totalIslands = 0;
        TempGrd = grid;
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++)
                totalIslands += checkAdjacent(i,j);
        return totalIslands;
    }
    private int checkAdjacent(int i, int j){
        if(i<0 || j<0 || i== TempGrd.length ||  j== TempGrd[0].length || TempGrd[i][j]=='0')
            return 0;
        TempGrd[i][j] = '0';
        checkAdjacent(i-1,j);
        checkAdjacent(i+1,j);
        checkAdjacent(i,j-1);
        checkAdjacent(i,j+1);
        return 1;
    }
}