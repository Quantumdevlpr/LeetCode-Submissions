class Solution {
    public List<List<String>> partition(String s) {
    List<List<String>> result = new ArrayList<>();
    List<String> current = new ArrayList<>();
    backtrack(s,0,current,result); 
    return result;  
    }
    private void backtrack(String s , int idx , List<String> current , List<List<String>> result){
      if(idx == s.length()){
        result.add(new ArrayList<>(current));
        return;
      }
      for(int i = idx ; i < s.length(); i++){
        if(isPalindrome(s,idx,i)){
          current.add(s.substring(idx,i+1));
          backtrack(s,i+1,current,result);
          current.remove(current.size()-1);
        }
      }
      }
      private boolean isPalindrome(String s , int a , int b ){
        while(a < b){
          if(s.charAt(a) != s.charAt(b)){
            return false;
          }
          a++;
          b--;
        }
        return true;
      }
}