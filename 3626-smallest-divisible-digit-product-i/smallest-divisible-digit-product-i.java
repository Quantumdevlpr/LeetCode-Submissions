class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n ; i <= 100 ; i++){
          if(product(i)%t == 0){
            return i;
          }
        }
        return n;
    }
    private int product(int a ){
      int result  =1;
      while(a > 0){
        int digit = a%10;
        result *= digit;
        a = a/10;
      }    
      return result;
    }
}