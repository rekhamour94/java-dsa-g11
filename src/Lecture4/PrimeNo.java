package Lecture4;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] vargs) {
        int n=10;
        int counter =0;
        for(int i =2;i<=n;i++){
            if(n%i==0){
                counter++;
            }
        }
        if(counter>=1){
            System.out.print("no is not prime");
        }
        else{
            System.out.print("no is  prime");
        }

    }
}
