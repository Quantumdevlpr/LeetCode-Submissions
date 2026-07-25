class Solution {
    public int maxProduct(int n) {
    int maxa = -1;
    int maxb = -1;
    while(n > 0){
      int a = n%10;
      if(a > maxa){
        maxb = maxa;
        maxa = a;
      }else if(a <= maxa){
        if(a > maxb){
          maxb = a;
        }
      }
      n/=10;
    }
    return maxa * maxb;
    }
}