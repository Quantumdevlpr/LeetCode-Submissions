class Solution {
    public int reverseDegree(String s) {
    int result = 0;
    int n = s.length();
    while(n > 0){
      int curr = s.charAt(n-1);
      int value = curr - 'a' + 1;
      int reverse = 26 - value + 1;
      result += n * reverse;
      n--;
    }
    return result;
    }
}