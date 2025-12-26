class Solution {
    public int bestClosingTime(String customers) {
    int penalty = 0;
    char[] arr = customers.toCharArray();
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i] == 'Y'){
        penalty++;
      }
    }  
    int rhour = 0;
    int minpenalty = penalty;
    for(int i = 0 ; i < customers.length() ; i++){
      if(customers.charAt(i) == 'Y'){
        penalty--;
      }
      else{
        penalty++;
      }
      if (penalty < minpenalty) {
        minpenalty = penalty;
        rhour = i + 1;
      }
    } 
    return rhour;
    }
}