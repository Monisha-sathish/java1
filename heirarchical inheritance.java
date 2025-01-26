class vechile{
    protected String vcolour;
    protected int vid;
    public vechile(String vcolour,int vid){
        this.vcolour=vcolour;
        this.vid=vid;
    }
}
class car extends vechile{
    protected int cost;
    protected int noofcars;
    public car(String vcolour,int vid,int cost,int noofcars){
        super(vcolour,vid);
        this.cost=cost;
        this.noofcars=noofcars;
    }
    public void display(){
        
        int cost3=cost*noofcars;
        System.out.println("The details of the car:");
         System.out.println("Cost of the vechicle "+cost);
         System.out.println("The total no of vechicles "+noofcars);
        System.out.println("The totalcost of the vechicle is "+cost3);
        System.out.println("The colour of the vechile is "+vcolour);
        System.out.println("The vechicle id is "+vid);
    }
}
class bike extends vechile{
    protected int cost;
    protected int noofbike;
    public bike(String vcolour,int vid,int cost,int noofbike){
        super(vcolour,vid);
        this.cost=cost;
        this.noofbike=noofbike;
    }
    public void display(){
        int cost1=cost*noofbike;
         System.out.println("The details of the bike:");
         System.out.println("Cost of the vechicle "+cost);
          System.out.println("The total no of vechicles "+noofbike);
        System.out.println("The totalcost of the vechicle is "+cost1);
        System.out.println("The colour of the vechile is "+vcolour);
        System.out.println("The vechicle id is "+vid);
    }
}
class scooty extends vechile{
    protected int cost;
    protected int noofscooty;
    public scooty(String vcolour,int vid,int cost,int noofscooty){
        super(vcolour,vid);
        this.cost=cost;
        this.noofscooty=noofscooty;
    }
    public void display(){
        int cost2=cost*noofscooty;
         System.out.println("The details of the scooty:");
          System.out.println("Cost of the vechicle "+cost);
           System.out.println("The total no of vechicles "+noofscooty);
         System.out.println("The totalcost of the vechicle is "+cost2);
        System.out.println("The colour of the vechile is "+vcolour);
        System.out.println("The vechicle id is "+vid);
    }
}
class Main{
    public static void main(String[] args){
        car obj1=new car("purple",1,50000,5);
        bike obj2=new bike("pink",2,10000,4);
        scooty obj3=new scooty("blue",3,15000,2);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}