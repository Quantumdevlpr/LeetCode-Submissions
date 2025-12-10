class Solution {
    public int lengthOfLongestSubstring(String s) {
    int result = 0;
    int len = s.length();
    for(int i = 0 ; i <len ; i++){
      int[] hash = new int[255];
      int length = 0;
      for(int j =i ; j< len;j++ ){
        if(hash[s.charAt(j)] == 1){
          break;
        }
        length = j - i + 1;
        result = Math.max(result , length);
        hash[s.charAt(j)] = 1;
      }
    } 
    return result;
    }
}