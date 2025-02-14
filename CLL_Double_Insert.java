class CircularDouble<T>{
    class Node{
        T data;
        Node prev;
        Node next;
        public Node(T data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    Node last=null;
    void insert(T data){
        Node newnode=new Node(data);
        if(last==null){
            last=newnode;
            last.next=newnode;
            last.prev=newnode;
        }
        else{
            newnode.next=last.next;
            newnode.prev=last;
            last.next=newnode;
            newnode.next.prev=newnode;
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
    void delete(int pos){
        if(pos==0){
            last.next=last.next.next;
        }
        else{
            Node temp=last.next;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next.next.prev=temp;
            temp.next=temp.next.next;
        }
    }
}
    public class Main{
        public static void main(String[] args){
            CircularDouble <Integer> c=new CircularDouble();
            c.insert(10);
            c.insert(20);
            c.insert(30);
            c.insert(40);
            c.insert(50);
            c.insert(60);
            c.insert(70);
            c.insert(80);
            c.display();
            System.out.println();
             c.delete(0);
             c.display();
             System.out.println();
            c.delete(2);
            c.display();
            System.out.println();
            c.delete(3);
            c.display();
        }
    }
