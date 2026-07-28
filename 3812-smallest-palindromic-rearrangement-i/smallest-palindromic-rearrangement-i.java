import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        if (n == 1) {
            return s;
        }

        // Take the first half of the palindrome
        char[] firstHalf = new char[n / 2];
        for (int i = 0; i < n / 2; i++) {
            firstHalf[i] = s.charAt(i);
        }

        // Sort the first half to make it lexicographically smallest
        Arrays.sort(firstHalf);

        String left = new String(firstHalf);
        String right = new StringBuilder(left).reverse().toString();

        // Even length palindrome
        if (n % 2 == 0) {
            return left + right;
        }

        // Odd length palindrome
        return left + s.charAt(n / 2) + right;
    }
}