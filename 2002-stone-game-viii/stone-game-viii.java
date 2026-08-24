class Solution {
    public int stoneGameVIII(int[] stones) {
    int n = stones.length;
    int[] t = new int[n];
    int[] prefixsum = new int[n];
    prefixsum[0] = stones[0];
    for(int i = 1 ; i < n ; i++){
      prefixsum[i] += prefixsum[i-1] + stones[i];
    }
    t[n-1] = prefixsum[n-1];
    for(int i = n -2 ; i >= 1 ; i--){
      int take = prefixsum[i] - t[i+1];
      int skip = t[i+1];
      t[i] = Math.max(take ,skip);
    }
    return t[1];
    }
}