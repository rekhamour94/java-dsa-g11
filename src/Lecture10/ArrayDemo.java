package Lecture10;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int r = 4;
        int c = 4;
        //int[][] arr  = new int[r][c];
        int[][] arr = {{1, 3, 5, 4}, {2, 6, 7, 8}, {10, 11, 24, 19}, {12, 15, 19, 20}};

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your values");

//        for (int i = 0;i<r;i++) {
//            for(int j= 0;j<c;j++) {
//                arr[i][j] =sc.nextInt();
//            }
//            System.out.println("please enter next row element");
//
//        }
        //int[][] arr = {{1, 3, 5, 4}, {2, 6, 7, 8}, {10, 11, 24, 19}, {12, 15, 19, 20}};

        for (int i = 0;i<r;i++) {
            for(int j= 0;j<c;j++) {
                System.out.print(" " +arr[i][j]);
            }
            System.out.println();

        }
        System.out.println(arr);
    }

    }
