class Solution {
    public int maxFrequency(int[] nums, int k) {
    int n = nums.length;
    Arrays.sort(nums);
    long[] prefix = new long[n];
    prefix[0] = nums[0];
    for(int i =  1 ;i < n;i++){
      prefix[i] = prefix[i-1]+nums[i];
    }
    int result = 0;
    for (int i = 0; i < n; i++) {
    result = Math.max(result, findBest(i, k, nums, prefix));
    }
    return result;
    }
    private int findBest(int targetIdx, int k, int[] nums, long[] prefix) {
        int target = nums[targetIdx];
        int i = 0;
        int j = targetIdx;
        int result = targetIdx;
        
        while (i <= j) {
            int mid = i + (j - i) / 2;
            long count = (targetIdx - mid + 1);
            long windowSum = (count * target);
            long currSum = prefix[targetIdx] - prefix[mid] + nums[mid];
            
            int ops = (int) (windowSum - currSum);
            
            if (ops > k) {
                i = mid + 1;
            } else {
                result = mid;
                j = mid - 1;
            }
        }
      return targetIdx - result+1;
    }
}