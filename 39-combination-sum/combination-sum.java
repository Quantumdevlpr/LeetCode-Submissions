class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> result =  new ArrayList<>();
        solve(candidates, target , curr , result ,0);
        return result;
    }
    private void solve(int[] candidates , int remsum ,List<Integer> curr , List<List<Integer>> result , int index){
      if(remsum == 0){
        result.add(new ArrayList<>(curr));
        return ;
      }
      if(remsum < 0 || index >= candidates.length){
        return ;
      }
      curr.add(candidates[index]);
      solve(candidates , remsum - candidates[index] , curr,result , index);
      curr.remove(curr.size()-1);
      solve(candidates , remsum , curr,result , index+1);
    }
    
}