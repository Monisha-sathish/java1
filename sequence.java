import java.lang.*;
import java.util.Scanner;
class sequence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
    static int fib(int n){
        if(n==0 || n==1){
        return 0;
    }
        else{
        return fib(n-1)+fib(n-2);
    }
    
}}
