package Lecture2;

public class SwitchClass {
    public static void main(String[] args) {
        int a = 20 ;
        switch (a) {
            case 10:
            {
                System.out.println("ambala");
                break;
            }
            case 20:
            {
                System.out.println("jind");
                break;
            }
            default: {
                System.out.println("no data");
            }

        }

        while(a<50) {

                System.out.println("ambala");
                a= a+20;
        }


    }
}
