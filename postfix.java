import java.io.*;
import java.util.*;

class Postfix
{
    public void push(int data){

    }
    public Double evaluate(String exp){
        //fill your code here
        Stack<Double> stack=new Stack<>();
        for(char ch:exp.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push((double)(ch-'0'));
            }
            else{
                double num2=stack.pop();
                double num1=stack.pop();
                switch( ch){
                    case '+':
                    stack.push(num1+num2);
                    break;
                    case '-':
                    stack.push(num1-num2);
                    break;
                    case '*':
                    stack.push(num1*num2);
                    break;
                    case '/':
                    stack.push(num1/num2);
                    break;
                    case '^':
                    stack.push(Math.pow(num1,num2));
                    break;
                }
            }
        }
        return stack.pop();
    }
    
}
import java.util.*;
class Main{
    public static void main(String args[]){
        //fill your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter postfix expression to be evaluated:");
        String exp=sc.nextLine();
        Postfix p=new Postfix();
        double res=p.evaluate(exp);
        System.out.println("Result is : "+(int)res);
        
    }
}