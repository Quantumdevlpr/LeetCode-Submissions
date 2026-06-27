class Solution {
    public int pivotIndex(int[] arr) {
     int n = arr.length;

        int[] pref = new int[n];
        int[] suff = new int[n];

        // Initialize the ends of prefix
        // and suffix array
        pref[0] = arr[0];
        suff[n - 1] = arr[n - 1];

        // Calculate prefix sum for all indices
        for (int i = 1; i < n; i++) 
            pref[i] = pref[i - 1] + arr[i];

        // Calculating suffix sum for all indices
        for (int i = n - 2; i >= 0; i--) 
            suff[i] = suff[i + 1] + arr[i];

        // Checking if prefix sum 
        // is equal to suffix sum
        for (int i = 0; i < n; i++) {
            if (pref[i] == suff[i]) 
                return i;
        }

        return -1;    
    }
}