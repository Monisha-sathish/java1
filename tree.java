import java.util.*;
class Main{
    public static void main(String args[]){
        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(10);
        tree.add(30);
        tree.add(10);
        tree.add(40);
        tree.add(2);
        tree.add(2);
        tree.add(1);
        for(int i:tree){
            System.out.println(i+" ");
        }
    }
}