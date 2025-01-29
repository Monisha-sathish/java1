// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a=10;//00001010-binary value for 10
        int b=20;//00010100
       int res=(a|b)& ~(a&b);
        System.out.println(res);
    }
}