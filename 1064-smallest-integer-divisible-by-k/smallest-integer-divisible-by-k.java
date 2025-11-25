class Solution {
    public int smallestRepunitDivByK(int k) {
    if(k == 1){
      return 1;
    }
    int modValue = 0;
    for(int i = 1 ; i <= k ; i++){
      modValue = (modValue * 10 + 1) % k;
      if(modValue == 0){
        return i;
      } 
    }    
    return -1;
    }
}