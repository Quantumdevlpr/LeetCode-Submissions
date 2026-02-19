class Solution {
    public int countBinarySubstrings(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }
        
        int result = 0;
        int prevRunLength = 0;
        int currRunLength = 1; 
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currRunLength++;
            } else {
                result += Math.min(prevRunLength, currRunLength);
                prevRunLength = currRunLength;
                currRunLength = 1;
            }
        }
        
        result += Math.min(prevRunLength, currRunLength);
        
        return result;
    }
}