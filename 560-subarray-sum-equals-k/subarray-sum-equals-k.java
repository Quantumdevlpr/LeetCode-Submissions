class Solution {
    public int subarraySum(int[] nums, int k) {
    Map<Integer , Integer> prefixcount = new HashMap<>();
    prefixcount.put(0,1);
    int count = 0;
    int sum = 0;
    for(int i = 0 ; i < nums.length ; i++){
      sum += nums[i];
      if(prefixcount.containsKey(sum-k)){
        count += prefixcount.get(sum-k);
      }
      prefixcount.put(sum , prefixcount.getOrDefault(sum,0)+1);
    }   
    return count;
    }
}