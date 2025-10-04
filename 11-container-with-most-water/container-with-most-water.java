class Solution {
    public int maxArea(int[] height) {
     //using the two pointer approach 
     int left = 0;
     int right = height.length-1;
     int result = 0;
     while(left<right){
      int amount = Math.min(height[left] , height[right]) * (right - left);
      if(height[left] < height[right]){
        left++;
      }else{
        right--;
      }
      result = Math.max(amount , result);
     }   
     return result;
    }
}