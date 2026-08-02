class Solution {

    public boolean stoneGame(int[] piles) {

        int n = piles.length;

        int sum = 0;
        for (int x : piles) {
            sum += x;
        }

        Integer[][] dp = new Integer[n][n];

        int alice = solve(0, n - 1, piles, dp);

        return alice > (sum - alice);
    }

    private int solve(int a, int b, int[] piles, Integer[][] dp) {

        if (a > b) {
            return 0;
        }

        if (a == b) {
            return piles[a];
        }

        if (dp[a][b] != null) {
            return dp[a][b];
        }

        int takeLeft = piles[a] +
                Math.min(
                        solve(a + 2, b, piles, dp),
                        solve(a + 1, b - 1, piles, dp)
                );

        int takeRight = piles[b] +
                Math.min(
                        solve(a + 1, b - 1, piles, dp),
                        solve(a, b - 2, piles, dp)
                );

        dp[a][b] = Math.max(takeLeft, takeRight);

        return dp[a][b];
    }
}