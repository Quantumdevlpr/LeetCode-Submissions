class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        if (k == 1) {
            int largest = -1;

            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                if (entry.getValue() == 1) {
                    largest = Math.max(largest, entry.getKey());
                }
            }

            return largest;
        }
        if (k == nums.length) {
            int result = Integer.MIN_VALUE;

            for (int num : nums) {
                result = Math.max(result, num);
            }

            return result;
        }

        int n = nums.length;

        int freq1 = mp.get(nums[0]);
        int freq2 = mp.get(nums[n - 1]);
        if (freq1 == 1 && freq2 == 1) {
            return Math.max(nums[0], nums[n - 1]);
        }

        if (freq1 == 1) {
            return nums[0];
        }

        if (freq2 == 1) {
            return nums[n - 1];
        }

        return -1;
    }
}