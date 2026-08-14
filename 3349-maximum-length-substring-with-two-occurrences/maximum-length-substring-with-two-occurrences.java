class Solution {
    public int maximumLengthSubstring(String s) {
    int[] arr = new int[26];
    int left = 0;
    int right = 0;
    int result =0;
    for(right = 0 ; right < s.length();right++){
       arr[s.charAt(right)-'a']++;
       while(arr[s.charAt(right)-'a']>2){
        arr[s.charAt(left)-'a']--;
        left++;
       }
      result = Math.max(result , right-left+1);
    }
    return result;
    }
}