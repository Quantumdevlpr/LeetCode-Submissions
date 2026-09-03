class Solution {
    public int minPathSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int[][] dp = new int[m][n];
    for(int i = 0;i < grid.length;i++){
      Arrays.fill(dp[i],-1);
    }
    int result = Solve(0,0,grid,m,n,dp);
    return result;
    }
    private int Solve(int i , int j , int[][] grid , int m , int n,int[][] dp){
      if(i == m-1 && j == n-1){
        return grid[i][j];
      }
      if(i >= m || j >= n){
        return Integer.MAX_VALUE;
      }
      if(dp[i][j] != -1){
        return dp[i][j];
      }
      int right = Solve(i,j+1,grid,m,n,dp);
      int down = Solve(i+1,j,grid,m,n,dp);
      return dp[i][j] = grid[i][j] + Math.min(right,down);
    }
}