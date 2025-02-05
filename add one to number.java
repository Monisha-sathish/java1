import java.math.BigInteger;
public class Solution {
    public int[] plusOne(int[] A) {
        StringBuilder str=new StringBuilder();
        for(int dig: A){
            str.append(dig);
        }
        BigInteger num=new BigInteger(str.toString());
        num=num.add(BigInteger.ONE);
        String resultstr=num.toString();
        int[] result=new int[resultstr.length()];
        for(int i=0;i<resultstr.length();i++){
            result[i]=resultstr.charAt(i)-'0';
        }
        return result;
    }
}