import java.util.Scanner;

public class userinputconditional {
    public static void main(String args[] ){ 
        Scanner scan= new Scanner (System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();

        if(num1 > num2){
            System.out.println("the  greater num 1"+num1);
        }
        else{
            System.out.println("the  greater num is "+num2);
    }

    }
}
