public class Solution {
    public int perfectPeak(int[] A) {
        int N = A.length;
        
        int[] Max = new int[N];
        int[] Min = new int[N];
        
        Max[0] = Integer.MIN_VALUE;
        for (int i = 1; i < N; i++) {
            Max[i] = Math.max(Max[i - 1], A[i - 1]);
        }
        
        Min[N - 1] = Integer.MAX_VALUE;
        for (int i = N - 2; i >= 0; i--) {
            Min[i] = Math.min(Min[i + 1], A[i + 1]);
        }
        
        for (int i = 1; i < N - 1; i++) {
            if (A[i] > Max[i] && A[i] < Min[i]) {
                return 1;
            }
        }
        
        return 0;
    }
}