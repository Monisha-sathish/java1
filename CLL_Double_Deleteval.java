class CircularDouble{
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    Node last=null;
    void insert(int data){
        Node newnode=new Node(data);
        if(last==null){
            last=newnode;
            last.next=newnode;
            last.prev=newnode;
        }
        else {
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
    void delete(int val){
        Node temp=last.next;
   
        if(last.next.data==val){
            last.next=last.next.next;
        }
        else if(last.data==val){
            last.prev.next=temp;
            temp.prev=temp.next;
            last=last.prev;
        }
        else{
            while(temp.next!=last){
            if(temp.next.data==val){
                temp.next.next.prev=temp;
                temp.next=temp.next.next;
                break;
            }
            
            temp=temp.next;
            } 
        }
}
}
    public class Main{
        public static void main(String[] args){
            CircularDouble  c=new CircularDouble();
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
             c.delete(10);
             c.display();
             System.out.println();
             c.delete(80);
             c.display();
             System.out.println();
             c.delete(40);
             c.display();
             System.out.println();
              c.delete(50);
             c.display();
             System.out.println();
              c.delete(60);
             c.display();
             System.out.println();
             c.delete(70);
             c.display();
             System.out.println();
               c.delete(30);
             c.display();
             System.out.println();
            
        }
    }
