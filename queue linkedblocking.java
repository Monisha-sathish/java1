import java.util.concurrent.LinkedBlockingQueue;
import java.util.*;
class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> obj=new LinkedBlockingQueue<>(21);
        System.out.println("The elements in the queue");
        obj.add(10);
        obj.add(20);
        obj.add(40);
        obj.add(70);
        obj.add(20);
        obj.add(50);
        obj.offer(67);
        for(int i:obj){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("After performing operationg");
       
      //  System.out.println(obj.get(4));
        System.out.println ("Peek =:"+obj.peek());
        System.out.println("Remove=:"+obj.remove());
        System.out.println("Poll=:"+obj.poll());
         System.out.println ("Peek =:"+obj.peek());
        System.out.println("Remove=:"+obj.remove());
         System.out.println("Poll=:"+obj.poll());
       
         obj.offer(67);
         for(int i:obj){
            System.out.print(i+" ");
        }
    }
}

