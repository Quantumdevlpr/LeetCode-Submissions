class Solution {
    public int[] rearrangeArray(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int posi =0;
    int negi=1;
    for(int i = 0;i<nums.length;i++){
      if(nums[i] > 0){
        result[posi] = nums[i];
        posi+=2;
      }else{
        result[negi] = nums[i];
        negi+=2;
      }
    }
    return result;
    }
}