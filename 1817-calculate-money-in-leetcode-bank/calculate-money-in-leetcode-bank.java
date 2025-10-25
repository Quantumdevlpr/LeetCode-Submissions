class Solution {
    public int totalMoney(int n) {
    int mod = 0;
    int count = 0;
    int result=0;
    for(int i = 1 ; i <= n ;i++){
      if(count == 7){
        mod=i/7+1;
        count=0;
      }else{
        mod++;
      }
      result+=mod;
      count++;
    }
    return result;
    }
}