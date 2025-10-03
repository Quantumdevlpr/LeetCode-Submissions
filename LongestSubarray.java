// Input: arr[] = [2, 7, 6, 1, 4, 5], k = 3
// Output: 4
// Explanation: The subarray [7, 6, 1, 4] has sum = 18, which is divisible by 3.

// Input: arr[] = [-2, 2, -5, 12, -11, -1, 7], k = 3
// Output: 5
// Explanation: The subarray [2, -5, 12, -11, -1], has sum = -3, which is divisible by 3.

// Input: arr[] = [1, 2, -2], k = 5
// Output: 2
// Explanation: The subarray is [2, -2] with sum = 0, which is divisible by 5.

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;
        System.out.println(longestsub(arr, k)); 
    }
    //naive approach
    // public static int longestsub(int[] array, int k) {
    //     int maxLen = 0;

    //     for (int i = 0; i < array.length; i++) {
    //         int sum = 0;
    //         for (int j = i; j < array.length; j++) {
    //             sum += array[j];
    //             if (sum % k == 0) {
    //                 maxLen = Math.max(maxLen, j - i + 1);
    //             }
    //         }
    //     }
    //     return maxLen;
    // }

    public static int longestsub(int[] arr , int k ){
     int n = arr.length;
        int sum = 0;
        int result = 0;
        Map<Integer , Integer > psum = new HashMap<>();
        for(int i =  0; i < n ; i++){
            sum = ((sum + arr[i]) % k + k) % k;
            if(sum == 0){
                result = i + 1;
            }
            else if(psum.containsKey(sum)){
                result = Math.max(result , i - psum.get(sum));
            }
            else{
                psum.put(sum , i);
            }
        }
        return result;   
    }
}
