class Solution {
    public boolean checkValidString(String s) {
    int n = s.length();
    Boolean[][] dp = new Boolean[n+1][n+1];
    return Solve(s, 0, 0, dp);   
    }

    private boolean Solve(String s , int index , int count,Boolean[][] dp ){
      if(count < 0){
        return false;
      }
      if(index == s.length()){
        return dp[index][count] = (count == 0);
      }
       if (dp[index][count] != null)
            return dp[index][count];
      if(s.charAt(index) == '('){
        return dp[index][count ] = Solve(s , index + 1 , count + 1,dp);
      }
      else if(s.charAt(index) == ')'){
        return dp[index][count] = Solve(s , index +1 , count - 1,dp);
      }

      return dp[index][count] = Solve(s,index+1,count+1,dp) || Solve(s , index + 1,count-1,dp)||Solve(s,index+1 , count,dp);

    }
}
