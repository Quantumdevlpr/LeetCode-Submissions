class Solution {
    public int largestSubmatrix(int[][] matrix) {
     int maxArea = 0;
     int row = matrix.length;
     int col = matrix[0].length;
     for(int i = 0 ; i < row ; i++){
      for(int j = 0 ; j < col ; j++){
        if(matrix[i][j] == 1 && i > 0){
          matrix[i][j] += matrix[i-1][j];
        }
      }
       Integer[] height = new Integer[col];
            for (int j = 0; j < col; j++) {
                height[j] = matrix[i][j];
            }

      Arrays.sort(height, Collections.reverseOrder());

      for(int x = 0 ; x < col ; x++){
        int b = x +1;
        int h = height[x];
        maxArea = Math.max(maxArea , b * h);
      }
     }
     return maxArea;
    }
}