class Solution {
    public int minimumDistance(int[] nums) {
      //hum log yha ek map use krenge to store the repeating indices
    Map<Integer,List<Integer>> map = new HashMap<>();
      for(int i = 0;i<nums.length;i++){
        map.computeIfAbsent(nums[i] , k -> new ArrayList<>()).add(i);
      }
      int minDist = Integer.MAX_VALUE;
      for(List<Integer> list : map.values()){
        if(list.size() >= 3){
          for(int i = 0;i +2 < list.size() ;i++){
            int a = list.get(i) , c =list.get(i+2);
            int dist= 2*(c-a);
            minDist = Math.min(minDist,dist);
          }
        }
      }
      return minDist == Integer.MAX_VALUE ? -1:minDist;
    }
}