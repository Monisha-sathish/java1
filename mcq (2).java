// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a=10;//00001010-binary value for 10
        int b=20;//00010100
        int c=a & b;//if any ip zero the ans is zero-00000000
        int d=a | b;//if any ip is 1 then 1 -00011110-ans is 30
        int e=a^b;// if both ip is same zero-00011110-ans is 30
        System.out.println( c+" "+d+" "+e);
    }
}