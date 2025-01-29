interface laptop{
    double cost=10000;
    void hp();
    void lenovo();
}
interface restaraunt{
    String name="Punjabi Daba";
    void order();
    void display();
}
class sub implements laptop,restaraunt{
    public void hp(){
        System.out.println("this is hp laptop from laptop interface and the cost is "+cost);
    }
    public void lenovo(){
        System.out.println("lenovo from lap interface");
    }
    public void order(){
        System.out.println("You order aa food!!"+name);
    }
    public void display(){
        System.out.println("Thankyou!!! for visiting us");
    }
}
class Main {
    public static void main(String[] args) {
        laptop obj=new sub();
        restaraunt obj1=new sub();
        obj.hp();
        obj.lenovo();
        obj1.order();
        obj1.display();
    }
}