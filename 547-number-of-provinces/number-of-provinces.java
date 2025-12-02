class Solution {
    public int findCircleNum(int[][] isConnected) {
    Set<Integer> visited = new HashSet<>();//ye set isliye taaki ye check kr ske ki kitne node already visited hai
    int result = 0;
    for(int i = 0 ; i < isConnected.length ; i++){
      if(!visited.contains(i)){
        dfs(i , isConnected , visited);
        result++;
      }
    }
    return result;   
    }
    private void dfs(int city , int[][] isConnected ,Set<Integer> visited){
      visited.add(city);
      for(int i = 0 ; i < isConnected[city].length ; i++){
        int conn = isConnected[city][i];
        if(conn == 1 && !visited.contains(i)){
          dfs(i , isConnected , visited);
        }
      }
    }
}