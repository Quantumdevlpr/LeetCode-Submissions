class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
    int n = nums.length;
    int[][] pairs = new int[n][2];
    for(int i = 0 ;  i < n ;i++){
      pairs[i][0] = nums[i];
      pairs[i][1] = i;
    } 
    Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
    int[] result = new int[n];
    int i = 0;
    while (i < n) {
    int j = i;
    List<Integer> values = new ArrayList<>();
    List<Integer> indices = new ArrayList<>();
    while (j < n) {
    if (j > i && pairs[j][0] - pairs[j - 1][0] > limit) {
      break;
    }
    values.add(pairs[j][0]);
    indices.add(pairs[j][1]);
    j++;
  }
  Collections.sort(indices);
  for (int k = 0; k < values.size(); k++) {
  result[indices.get(k)] = values.get(k);
  }
  i = j; 
  }
  return result;
  }
}