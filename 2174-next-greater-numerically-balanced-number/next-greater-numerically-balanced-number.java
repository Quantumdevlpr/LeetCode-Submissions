class Solution {
    public int nextBeautifulNumber(int n) {
     for(int num = n+1; num<=1224444 ;num++){
      if(balanced(num)){
        return num;
      }else{
        continue;
      }
      }
      return -1;   
    }
    private boolean balanced(int num ){
      int[] arr = new int[10];
      while(num > 0){
        int digit = num%10;
        arr[digit]++;
        num=num/10;
      }
      for(int digit = 0;digit < 10;digit++){
        if(arr[digit]>0 && arr[digit] != digit){
          return false;
        }
      }
      return true;
    }
}