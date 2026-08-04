class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    List<Integer> result = new ArrayList<>();
    //simple question , we will first calculate the minimum and maximum
      int min=Integer.MAX_VALUE;
      int max =Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
          min=nums[i];
        }
        if(nums[i]>max){
          max= nums[i];
        }
      }
      //ek set lo and usme add krdo n tk saare elements 
      Set<Integer> record =  new HashSet<>();
      for(int i : nums){
        record.add(i);
      }
      //fianlly just add the numbers iterating over the array if they are not in the record list 
      for(int i =min;i<= max;i++){
        if(!record.contains(i)){
          result.add(i);
        }
      }
      return result;
      
    }
}