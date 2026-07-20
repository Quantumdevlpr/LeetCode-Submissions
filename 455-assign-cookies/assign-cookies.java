class Solution {
    public int findContentChildren(int[] g, int[] s) {
    int result = 0;
    Arrays.sort(g);
    Arrays.sort(s);
    int left = 0;
    int right = 0;
   while(left < g.length && right < s.length){

            if(g[left] <= s[right]){
                result++;
                left++;
                right++;
            }else{
                right++;
            }
        }
      return result;
    }
}