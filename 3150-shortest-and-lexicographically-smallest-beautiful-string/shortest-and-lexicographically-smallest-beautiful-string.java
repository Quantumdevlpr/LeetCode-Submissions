class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
    String ans = "";
    int n = s.length();
    for(int i = 0 ; i < n ; i++){
      int count = 0;
      StringBuilder cur = new StringBuilder();
      for(int j = i ; j < n ;j++){
        cur.append(s.charAt(j));
        if(s.charAt(j) == '1'){
          count++;
        }
        if(count > k){
          break;
        }
        if(count == k){
          String curr = cur.toString();
          if(ans.isEmpty() || curr.length() < ans.length()||(curr.length() == ans.length() && curr.compareTo(ans) < 0 )){
            ans = curr;
          }
        }
      }
    } 
    return ans;
    }
}