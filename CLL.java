class Circular<T>{
    class Node{
        T data;
        Node next;
        Node last;
        Node(T data){
            this.data=data;
            this.next=null;
        }
    }
    Node last=null;
    void insert(T data){
        Node newnode = new Node(data);
        if(last==null){
            last=newnode;
            last.next=newnode;
        }else{
            newnode.next=last.next;
            last.next=newnode;
            last=newnode;
        }
    }
    void display(){
        Node temp=last.next;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=last.next);
    }
}
public class Main{
    public static void main(String [] args){
        Circular<Integer> li = new Circular();
        li.insert(40);
        li.insert(80);
        li.insert(90);
        li.display();
    }
    
}