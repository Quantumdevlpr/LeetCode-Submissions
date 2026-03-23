class Solution {
    public int[] rearrangeArray(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int negIndex = 1;
    int posIndex  = 0;
    for(int i = 0 ; i < n ;i++){
      if(nums[i] < 0){
        result[negIndex] = nums[i];
        negIndex+=2;
      }else{
        result[posIndex] = nums[i];
        posIndex+=2;
      }
    }    
    return result;
    }
}