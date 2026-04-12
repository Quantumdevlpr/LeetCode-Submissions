class Solution {
    int dist(int a, int b) {
        return Math.abs(a / 6 - b / 6) + Math.abs(a % 6 - b % 6);
    }

    public int minimumDistance(String word) {
        int n = word.length();
        int[]dp = new int[26]; 
        int res = 0, total = 0;

        for (int i = 1; i < n; i++) {
            int curr = word.charAt(i) - 'A';
            int prev = word.charAt(i - 1) - 'A';

            int best = 0;
            for (int j = 0; j < 26; j++) {
                best = Math.max(best, dp[j] + dist(prev, curr) - dist(j, curr));
            }

            dp[prev] = best;
            total += dist(prev,curr);
        }

        return total - Arrays.stream(dp).max().getAsInt();
    }
}