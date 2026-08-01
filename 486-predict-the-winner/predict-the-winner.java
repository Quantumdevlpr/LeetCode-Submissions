class Solution {
    public boolean predictTheWinner(int[] nums) {
    int n = nums.length;
    int sum = 0;
    for(int i : nums){
      sum+= i;
    }   
    int p1 = Solve(0,n-1,nums);
    return p1 >= (sum - p1);
    }
    private int Solve(int i , int j , int[] nums){
      if (i > j) return 0;
      if (i == j) return nums[i];
      int take_i = nums[i] + Math.min(Solve(i+2 , j,nums) , Solve(i+1,j-1,nums));
      int take_j = nums[j] + Math.min(Solve(i+1,j-1,nums),Solve(i,j-2,nums));
      return Math.max(take_i , take_j);
    }

}