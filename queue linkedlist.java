import java.util.*;
class Main {
    public static void main(String[] args) {
        Queue <Integer> obj=new LinkedList<>();
        System.out.println("The elements in the queue");
        obj.add(10);
        obj.add(30);
        obj.add(40);
        obj.add(70);
        obj.add(20);
        obj.add(50);
        obj.add(90);
        obj.add(40);
        for(int i:obj){
            System.out.println(i);
        }
        System.out.println("After performing operationg");
       
      //  System.out.println(obj.get(4));
        System.out.println (obj.peek());
        System.out.println(obj.remove());
        System.out.println(obj.poll());
    }
}
