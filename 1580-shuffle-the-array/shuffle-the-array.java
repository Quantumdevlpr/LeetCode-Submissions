class Solution {
    public int[] shuffle(int[] nums, int n) {
     int length = nums.length;
     int[] result = new int[length];
     for(int i =  0 ; i < length ; i++){
      if(i%2 == 0){
        result[i]=nums[i/2];
      }else{
        result[i]=nums[n];
        n++;
      }
     }   
     return result;
    }
}