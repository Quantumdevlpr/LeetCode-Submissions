class Solution {
    public int trap(int[] height) {
    int n = height.length;
    int left = 0;
    int right = n-1;
    int lmax = height[left],rmax = height[right];
    int w = 0;
    while(left < right){
      if(lmax < rmax){
        left++;
        lmax = Math.max(lmax , height[left]);
        w += lmax - height[left];
      }else {
      right--;
      rmax = Math.max(rmax, height[right]);
      w += rmax - height[right];
      }
    } 
    return w;  
    }
}