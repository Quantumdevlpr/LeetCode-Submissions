class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
    List<List<Integer>> adj = new ArrayList<>();
    int n = quiet.length;
    int[] indegree = new int[n];
    for(int i =0 ;i< n ; i++){
            adj.add(new ArrayList<>());
             
        }
    for(int rich[] : richer){
      int to = rich[1];
      int from = rich[0];
      adj.get(from).add(to);
    }
    for(int i=0;i<n ;i++){
       for(int j=0 ; j< adj.get(i).size(); j++){
         int x= adj.get(i).get(j);
         indegree[x]++;
       }
     }
    int[] ans = new int[n];
            for (int i = 0; i < n; i++) ans[i] = i; 

            Queue<Integer> queue = new LinkedList<>();
            for(int  i=0 ; i<n ; i++){
                if(indegree[i] == 0) queue.offer(i);
            }
            int[] toposort = new int[n];
           
            while(!queue.isEmpty()){
                int val = queue.poll();
                
                for(int node: adj.get(val)){
                     if (quiet[ans[val]] < quiet[ans[node]]) {
                    ans[node] = ans[val];
                }
                indegree[node]--;
                    
                    if(indegree[node]==0){
                        queue.offer(node);
                    }
                }
            }
            return ans;
          }
        }