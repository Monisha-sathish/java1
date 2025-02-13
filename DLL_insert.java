public class DLL_insert
{
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head = null;
    Node last = null;
    void insert(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            last = newnode;
        }
        else{
            newnode.prev=last;
            last.next = newnode;
            last = newnode;
            
        }
        
    }
    
    void insertaf(int pos,int data){
        Node newnode = new Node(data);
        Node temp = head;
        if(pos==0){
           newnode.next=head;
           head.prev = newnode;
           head = newnode;
        
        }
        else{
            for(int i=0;i<pos-1;i++){
                temp = temp.next;
            }
            newnode.next = temp.next;
            newnode.prev = temp;
            temp.next.prev = newnode;
            temp.next=newnode;
        }
    } 
    
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main m = new Main();
		m.insert(5);
		m.insert(25);
		m.display();
		System.out.println();
		m.insertaf(0,11);
		m.insertaf(1,10);
		m.insertaf(2,20);
		m.display();
		
	}
}