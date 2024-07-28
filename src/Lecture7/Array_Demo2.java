package Lecture7;

import java.util.Scanner;

public class Array_Demo2 {
    public static void main(String[] args) {
        int result = arrayDemo();
        System.out.println(result);

    }

    private static int arrayDemo() {
        int[] arr = {10,9,5,3,4,13,19,20,25,0};
        Scanner sc =  new Scanner(System.in);
        int item = 3;
        System.out.println("array before swap");
       /* for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }*/
        for(int i =0;i<arr.length;i++) {
            if(arr[i] == item) {
                System.out.println("element found at" + i);
                return i;
            }
        }
        System.out.println("element not found");
        return  - 1;

    }

    public static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=  temp;
    }
}
