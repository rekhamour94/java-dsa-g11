package Lecture7;

public class MainExample {
    public static void main(String[] args) {
        System.out.println("hello");
        int a  = 9;
        int b =10;
        add(a,b);
        sub();
    }
    public static int add(int a,int b){
        int c = a+b;
        System.out.println(c);
        return c;
    }
    public static void sub(){
        int a = 9;
        int b= 7;
        add(a,b);
        int c = a-(add(a,b));
        System.out.println(c);
    }
}
