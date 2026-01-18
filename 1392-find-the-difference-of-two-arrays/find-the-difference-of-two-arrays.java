class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> result = new ArrayList<>();
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    for(int num : nums1 ){
      set1.add(num);
    }
    for(int num : nums2 ){
      set2.add(num);
    }
    ArrayList<Integer> res1 = new ArrayList<>();
    ArrayList<Integer> res2 = new ArrayList<>();
    for(int num : set1){
      if(!set2.contains(num)){
        res1.add(num);
      }
    }
    for(int num : set2 ){
      if(!set1.contains(num)){
        res2.add(num);
      }
    }
    return Arrays.asList(res1,res2);
    }
}