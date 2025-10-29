class Solution {
    public int smallestNumber(int n) {
    int k=1;
    while(true){
      int result = (1<<k)-1;
      if(result>=n){
        return result;
      }
      k++;
    }  
    }
}