import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");// anna asked gnnnhg hm->op:anna,gnnnhg
        for(int i=0;i<s.length;i++){
            if(s[i].charAt(0)==(s[i].charAt(s[i].length()-1))){
                System.out.println(s[i]);
            }
        }
    }
}