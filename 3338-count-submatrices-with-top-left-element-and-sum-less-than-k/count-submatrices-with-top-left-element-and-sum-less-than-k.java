class Solution {
    public int countSubmatrices(int[][] grid, int k) {
       // ab hum use krenge prefix matrix sum 
       int m = grid.length;
       int n = grid[0].length;
       int[][] prefix = new int[m][n];
       prefix[0][0] = grid[0][0];
       
       for(int i = 1 ; i < n ; i++){
        prefix[0][i] = prefix[0][i-1] + grid[0][i]; 
       } 
       
       for(int j = 1 ; j < m ; j++){
        prefix[j][0] = prefix[j-1][0] + grid[j][0]; 
       } 
       for(int i = 1 ; i < m ;i++){
        for(int j = 1 ; j < n ;j++){
          prefix[i][j] = prefix[i-1][j] + grid[i][j] - prefix[i-1][j-1]+prefix[i][j-1];
        }
       }
       int result = 0;
       for(int i =0 ; i < prefix.length ; i++){
        for(int j = 0 ; j < prefix[0].length ; j++){
          if(prefix[i][j] <= k){
            result++;
          }
        }
       }
       return result;
    }
}