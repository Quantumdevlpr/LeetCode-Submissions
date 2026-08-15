class Solution {
    public int longestSubsequence(int[] nums) {
    int n = nums.length;
    int resultXor = 0;//kyunki xor tb hi o hota jb same element ka ho
    Boolean allzero = true; //check krne ke liye ki sare zero to nhi 
    for(int num : nums){
      resultXor = resultXor ^ num;
      if(num!=0){
        allzero =false;
      }
    }   
    if(allzero){
      return 0;
    }
    if(resultXor == 0){
      return n-1;
    }
    return n;
    }
}