class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int n = grid.length;
        int m = grid[0].length;
        int numIslands = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If we find an unvisited piece of land
                if (grid[i][j] == '1') {
                    numIslands++;
                    bfs(grid, i, j); // Sink the island
                }
            }
        }
        
        return numIslands;
    }
    
    private void bfs(char[][] grid, int row, int col) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row, col});
        grid[row][col] = '0'; 
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int ro = curr[0];
            int co = curr[1];
            for (int i = 0; i < 4; i++) {
                int crow = ro + delRow[i];
                int ccol = co + delCol[i];
                if (crow >= 0 && crow < n && ccol >= 0 && ccol < m && grid[crow][ccol] == '1') {
                    grid[crow][ccol] = '0'; 
                    q.add(new int[]{crow, ccol});
                }
            }
        }
    }
}