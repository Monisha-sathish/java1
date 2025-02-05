public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        if(A==null || A.isEmpty()){
            return 0;
        }
        int sum=A.get(0);
        int max=A.get(0);
        for(int i=1;i<A.size();i++){
            sum=Math.max(A.get(i),sum+A.get(i));
            max=Math.max(max,sum);
        }
        return max;
    }
}
