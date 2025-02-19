import java.util.*;
public class Stack{
	public String validate(String data) {
		//Fill your code
		java.util.Stack<Character> s=new java.util.Stack<>();
		for(char ch:data.toCharArray()){
			if(ch=='(' || ch=='{' || ch=='[' || ch=='<'){
				s.push(ch);
			}
			else if(ch==')' || ch==']' || ch=='}' || ch=='>'){
			if(s.isEmpty()){
				return "No";
			}
			char top=s.pop();
			if(ch==')' && top!='(' || ch==']' && top!='[' || ch=='}' && top!='{' ||ch=='<' && top!='>'){
				 return "No";
			}
		} 
		}
    return s.isEmpty() ? "Yes" : "No";
	}

}
import java.util.*;
public class Main{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
        Stack s=new Stack();
		for(int i=0;i<n;i++){
			String exp=sc.nextLine();
			System.out.println(s.validate(exp));
	}
	
    }
}   