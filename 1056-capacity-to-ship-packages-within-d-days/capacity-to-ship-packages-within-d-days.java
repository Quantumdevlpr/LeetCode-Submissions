class Solution {
    public int shipWithinDays(int[] weights, int days) {
    int left = 0;
    int right = 0;   
    for(int i : weights ){
      left = Math.max(left , i);
      right+=i;
    }
    while(left < right){
      int mid = (left+right)/2;
      int need = 1,cur=0;
      for(int i : weights){
        if(cur+i > mid){
          need+=1;
          cur=0;
        }
        cur+=i;
      }
      if(need > days){
        left = mid+1;
      }else{
        right = mid;
      }
    }
    return left;
    }
}