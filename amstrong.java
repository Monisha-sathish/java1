class armstrong {
 public static void main(String[] args){
   int r,sum=0,temp,num;
num=153;
temp=num;
while(num>0){
r=num%10;
sum=sum+(r*r*r);
num=num/10;
}
if (temp==sum){
System.out.println("153 is an armstrong number");
}
else{
System.out.println( "153 is not an armstrong number");
}
}
}