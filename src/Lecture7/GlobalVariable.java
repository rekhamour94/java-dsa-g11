package Lecture7;

public class GlobalVariable {
    static int val = 100;
    public static void main(String[] args) {
        System.out.println("hello");
        int a  = 9;
        int b =10;
        add(a,b);
        sub();
        System.out.println(val);
    }
    public static int add(int a,int b){
        int c = a+b;
        val = 200;
        System.out.println(c);
        return c;
    }
    public static void sub(){
        int a = 9;
        int b= 7;
        int val = 60;
        val = val+5;
        System.out.println(val);
        add(a,b);
        int c = a-(add(a,b));
        System.out.println(c);
    }
}
