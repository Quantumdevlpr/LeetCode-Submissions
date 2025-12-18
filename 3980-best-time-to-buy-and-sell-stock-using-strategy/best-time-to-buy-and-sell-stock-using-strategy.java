class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long original = 0;
        for (int i = 0; i < n; i++) {
            original += (long) strategy[i] * prices[i];
        }
        long[] prefPrice = new long[n + 1]; 
        long[] prefSP = new long[n + 1];      

        for (int i = 0; i < n; i++) {
            prefPrice[i + 1] = prefPrice[i] + prices[i];
            prefSP[i + 1] = prefSP[i] + (long) strategy[i] * prices[i];
        }
        long bestChange = 0;
        int half = k / 2;

        for (int l = 0; l + k <= n; l++) {
            int mid = l + half;
            int r = l + k;
            long firstHalf = -(prefSP[mid] - prefSP[l]);
            long secondHalf = (prefPrice[r] - prefPrice[mid]) - (prefSP[r] - prefSP[mid]);

            long delta = firstHalf + secondHalf;
            bestChange = Math.max(bestChange, delta);
        }

        return original + bestChange;
    }
}
