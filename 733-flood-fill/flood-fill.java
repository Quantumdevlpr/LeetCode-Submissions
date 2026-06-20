class Pair{
  int row;
  int col;
  Pair(int r , int c){
    this.row = r;
    this.col = c;
  }
}
class Solution {
  //bfs trial
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int n  = image.length;
    int m = image[0].length;
    int initial = image[sr][sc];
    if(initial == color){
      return image;
    }
    image[sr][sc] = color;
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(sr,sc));
    int[] dr = {-1,0,+1,0};
    int[] dc = {0,1,0,-1};
    while(!q.isEmpty()){
       Pair current  = q.remove();
      for(int i = 0 ; i <  4 ; i++){
      int ro = current.row;
      int co = current.col;
      int nrow = ro+dr[i];
      int ncol = co + dc[i];
      if(nrow >= 0 && nrow <  n && ncol >= 0 && ncol < m && image[nrow][ncol] == initial){
        image[nrow][ncol] = color;
        q.add(new Pair(nrow,ncol));
      }
      }
    }
    return image;
    }
}