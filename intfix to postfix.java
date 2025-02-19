import java.util.*;
class infix{
    public static int precedence(char ch){
        switch(ch){
            case '+': case '-':return 1;
            case '*' : case '/':return 2;
            default:
            return -1;
        }
    }
        public static boolean isoperator(char ch){
            return ch=='+'||ch=='-'||ch=='*'||ch=='/';
        }
        public static String toPostfix(String infix){
            Stack<Character> stack=new Stack<>();
            StringBuilder postfix=new StringBuilder();
            for(char ch:infix.toCharArray()){
                if(Character.isLetter(ch)){
                    postfix.append(ch);
                }
          else  if(ch=='('){
                    stack.push(ch);
                }
                else if(ch==')'){
                   while(!stack.isEmpty() && stack.peek()!='('){
                       postfix.append(stack.pop());
                   }
                   stack.pop();
                }
                   else if(isoperator(ch)){
                       while(!stack.isEmpty() &&  precedence(stack.peek()) >= precedence(ch)){
                           postfix.append(stack.pop());
                       }
                       stack.push(ch);
                   }
                   else{
                       return "Invalid Input";
                   }
                }
            while(!stack.isEmpty()){
                postfix.append(stack.pop());
            }
            return postfix.toString();
        }
}   
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the infix expression");
        String infix=sc.nextLine();
        infix i=new infix();
        String result=i.toPostfix(infix);
        if(result.equals("Invalid Input")){
            System.out.println("Invalid input");
        }
        else{
        System.out.println("The postfix expression is");
        System.out.println(result);
        }
    }
}   