import java.util.*;
class perimeter{
    public static void main(String[] args){
        System.out.println("enetr the perimeter: "); 
              Scanner sc = new Scanner(System.in);
        double radius =sc.nextDouble();
        double perimeter;
        double area;
        if (radius<=0){
            System.out.println("please enter a non zero positive integer");
        }
        else{
            perimeter=2*Math.PI*radius;
            area=Math.PI*radius*radius;
            System.out.println(perimeter);
            System.out.println(area);
        }
    }
}