class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
        Arrays.fill(dp[i], -1);
        }
        return Solve(0,0,m,n,obstacleGrid,dp);
    }
    public int Solve(int i , int j , int m , int n,int[][] obstacleGrid,int[][] dp){
    if(i >= m || j >= n){
      return 0;
    }
    if(obstacleGrid[i][j] == 1){
      return 0;
    }
    if(i == m-1 && j == n-1){
      return 1;
    }
    if(dp[i][j] != -1){
      return dp[i][j];
    }
    int right =  Solve(i,j+1,m,n,obstacleGrid,dp);
    int down = Solve(i+1,j,m,n,obstacleGrid,dp);
    return dp[i][j] = right+down;
    }
}