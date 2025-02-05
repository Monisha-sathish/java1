import java.util.*;
public class Solution {
    public int[] maxset(int[] A) {
        int s=-1,e=-1;
        int temp=0;
        long sum=0,temp_sum=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<0){
                temp=i+1;
                temp_sum=0;
            }
            else{
                temp_sum+=A[i];
                if(temp_sum > sum || (temp_sum==sum && (i-temp > e-s))){
                    s=temp;
                    e=i;
                    sum=temp_sum;
                }
            }
        }
        if(s==-1){
            return new int[0];
        }
        int[] res=new int[e-s+1];
        for(int i=s;i<=e;i++){
            res[i-s]=A[i];
        }
        return res;
    }
}
