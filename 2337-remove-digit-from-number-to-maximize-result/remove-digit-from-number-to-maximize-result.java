class Solution {
    public String removeDigit(String number, char digit) {
    String max = "0";
    for(int i =  0 ; i < number.length() ; i++){
      if(digit == number.charAt(i)){
        StringBuilder sb = new StringBuilder(number);
        sb.deleteCharAt(i);
        String candidate = sb.toString();
        if(candidate.compareTo(max) > 0){
          max = candidate;
        }
      }
    }  
    return max;
    }
}