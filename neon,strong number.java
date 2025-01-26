class Parent{
    protected int num;
}
class Perfect extends Parent{
    public void logic(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i!=num && num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }
       
}
class Strong extends Perfect{
    public int fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    public void logics(int num){
        int sums=0;
        int a=num;
        while(num!=0){
            int rem=num%10;
            sums=sums+fact(rem);
            num=num/10;
        }
        if(sums==a){
            System.out.println("It is a strong number");
        }
        else{
            System.out.println("It is not a strong number");
        }
    }
   
}
class Main extends Strong{
    public void logicss(int num){
        int b=num;
        int sq=num*num;
        int sumss=0;
        while(sq!=0){
            int rem=sq%10;
            sumss=sumss+rem;
            sq=sq/10;
        }
        if(b==sumss){
        System.out.println("It is a neon number");
    }
    else{
        System.out.println("Not a neon number");
    }
    }
        public static void main(String[] args){
        Perfect obj=new Perfect();
        obj.logic(6);
        Strong obj1=new Strong();
        obj1.logics(145);
        Main obj2=new Main();
        obj2.logicss(9);
    }
}
