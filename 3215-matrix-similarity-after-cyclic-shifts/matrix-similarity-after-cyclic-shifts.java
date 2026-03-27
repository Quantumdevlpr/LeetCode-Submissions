class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        
        k %= col;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                if (i % 2 == 0) {
                    // Even row: check left rotation
                    if (mat[i][j] != mat[i][(j + k) % col]) {
                        return false;
                    }
                } else {
                    // Odd row: check right rotation
                    if (mat[i][j] != mat[i][(j - k + col) % col]) {
                        return false;
                    }
                }
                
            }
        }  
        return true;
    }
}