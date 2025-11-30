class Solution {
  static final int mod_value = 1000000007;
    public int countGoodNumbers(long n) {
    long even =  (n + 1) /2;
    long odd = ( n / 2);  
    long evenR = Power(5 , even);
    long oddR = Power(4 , odd);
    return (int)((evenR * oddR) % mod_value);
    }

long Power(long a , long b){
  long result = 1;
        a = a % mod_value;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % mod_value;
            }
            a = (a * a) % mod_value; 
            b >>= 1;              
        }

        return result;
}
}