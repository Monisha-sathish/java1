class exam{
    protected int dig;//159
    public exam(int dig){
        this.dig=dig;
    }
}
class intermediate extends exam{
    public intermediate(int dig){
        super(dig);
    }
    public int sum1(int dig){
    int sum=0;
    
    if(dig==0)
    {
        return 0;
    }
    else
    {
        while(dig > 0)
        {
        int num=dig%10;//9,5,1
        sum=sum+num;//9,14,15
        dig=dig/10;//15,1,0
        }
        //now sum is 15
        if(sum > 9)
        {
        return sum1(sum);//here call the sum method because sum is 15 
        }
        else{
        return sum;
        //here the sum is 6 then it return 6
        }
    }
        
    }
}
class Main{
    public static void main(String[] args){
        intermediate obj=new intermediate(159);
        int result = obj.sum1(obj.dig); // Call sum1 with the dig value now obj.dig goto class exam and access the dig
        System.out.println("Sum of digits: " + result); // Print the result
    }
}