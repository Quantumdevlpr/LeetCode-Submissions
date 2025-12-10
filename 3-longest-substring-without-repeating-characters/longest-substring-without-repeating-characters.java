class Solution {
    public int lengthOfLongestSubstring(String s) {
    int[] hash = new int[255];
    for(int i = 0 ; i < hash.length;i++){
      hash[i] = -1;
    }
    int n = s.length();
    int l = 0;
    int r=0;
    int len = 0;
    int result=0;
    while(r < n){
      if(hash[s.charAt(r)] != -1){
        if(hash[s.charAt(r)] >= l){
          l = hash[s.charAt(r)] + 1;
        }
      }
      len = r-l+1;
      result = Math.max(result , len);
      hash[s.charAt(r)] = r;
      r++;
    }
    return result;
  }
}