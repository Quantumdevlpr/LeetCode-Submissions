class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (sumof(nums[i]) == i) {
                return i;
            }
        }

        return -1;
    }

    private int sumof(int a) {
        int sum = 0;

        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }

        return sum;
    }
}