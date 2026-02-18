class Solution {
    public boolean hasAlternatingBits(int n) {
    while(n > 0){
      int lastbit = n&1;
      n = n >> 1;
      if(n > 0 && lastbit == (n&1)){
        return false;
      }
    }
    return true;
    }
}