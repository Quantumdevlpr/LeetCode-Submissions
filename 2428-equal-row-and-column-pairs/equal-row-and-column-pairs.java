 class Solution {
     public int equalPairs(int[][] grid) {
         int count = 0;
         int n = grid.length;
         HashMap<String, Integer> mp = new HashMap<>();

         for( int r = 0; r < n; r++ ) {
             String row = "";
             for( int c = 0; c < n; c++ ) {
                 row = row + "_" + grid[r][c];
             }
             mp.put(row, mp.getOrDefault(row, 0) + 1);
         }

         for( int c = 0; c < n; c++ ) {
             String col = "";
             for( int r = 0; r < n; r++ ) {
                 col = col + "_" + grid[r][c];
             }

             if( mp.containsKey(col) ) {
                 count += mp.get(col);
             }
         }
         return count;
     }
 }