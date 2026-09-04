class Solution {
    public int recur(int[][] nums,int i,int j,int l,int[][][] dp){
        if(j>=nums[0].length || l>=nums[0].length || j<0 || l<0){
            return 0;
        }
        if(i==nums.length-1){
            if(j==l) return nums[i][j];
            else return nums[i][j]+nums[i][l];
        }
        if(dp[i][j][l]!=-1) return dp[i][j][l];
        int max=0;
        for(int a=-1;a<2;a++){
            for(int b=-1;b<2;b++){
                max=Math.max(max,recur(nums,i+1,j+a,l+b,dp));
            }
        }
        if(j==l) return dp[i][j][l]=max+nums[i][j];
        else return dp[i][j][l]=max+nums[i][j]+nums[i][l];
    }
    public int cherryPickup(int[][] grid) {
        int[][][] dp=new int[grid.length][grid[0].length][grid[0].length];
        for(int[][] arr1:dp){
            for(int[] arr2:arr1) Arrays.fill(arr2,-1);
        }
        return recur(grid,0,0,grid[0].length-1,dp);
    }
}