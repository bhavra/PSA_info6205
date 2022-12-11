package com.company;
//Unique Robot paths with obstacles
public class Question4 {
    public int robotPathsWithObstacles(int[][] inputObstacleGrid) {
        int m=inputObstacleGrid.length;
        int n=inputObstacleGrid[0].length;
        int[][] dp=new int[m][n];
        if(inputObstacleGrid[0][0]==1 || inputObstacleGrid[m-1][n-1]==1){
            return 0;
        }
        dp[0][0]=1;
        for(int i=1;i<m && inputObstacleGrid[i][0]==0;i++){
            dp[i][0]=1;
        }
        for(int j=1;j<n && inputObstacleGrid[0][j]==0;j++){
            dp[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(inputObstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }

//Time complexity and
// space complexity -  O(1)
}
