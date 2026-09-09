class Solution {
    public long countCommas(long n) {
    long result = 0;
    long start = 1000;
    long comma = 1;
    while(start <= n){
        long end = Math.min(n , start * 1000 - 1);
        result +=((end - start) + 1)*comma;
        comma+=1;
        start *= 1000;
    }
    return result;
    }
}