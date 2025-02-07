import java.util.*;
public class Solution {
    public int[] flip(String A) {
        int n = A.length();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (A.charAt(i) == '0') ? 1 : -1;
        }
        
        int maxSum = 0;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        if (maxSum <= 0) {
            return new int[0];
        }

        return new int[]{start + 1, end + 1};
    }
}
