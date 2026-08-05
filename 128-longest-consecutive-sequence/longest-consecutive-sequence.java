class Solution {
    public int longestConsecutive(int[] nums) {
    int n = nums.length;
    if(n == 0){
      return 0;
    }
    if(n == 1){
      return 1;
    }
    Set<Integer> set = new HashSet<>();
    for(int num : nums){
      set.add(num);
    } 
    int result = 1;
    for(int i : set){
      if(!set.contains(i-1)){
        int count = 1;
        int x = i;
        while(set.contains(x+1)){
          x=x+1;
          count++;
        }
        result = Math.max(result , count);
      }
    }
    return result;
    }
}