package Lecture9;

public class RotateArray {
    public static void main(String[] args) {
        reverseArray();

    }

    private static void reverseArray() {
        int[] arr = new int[]{1,2,5,3,4,2};
        int k = 2;
        int n= arr.length;
        //reverse krna h poora array
        //jitni bar k utni bar reverse krdenge
        //k to n-1 reverse krdenge
        reverseItems(arr,0, n-1);
        reverseItems(arr,0,k-1);
        reverseItems(arr,k,n-1);
        for(int l = 0;l<arr.length;l++) {
            System.out.println("elements after rotation "+ arr[l]);
        }
    }

    private static void reverseItems(int[] arr, int i, int n) {
        int  j = n;
        int k  = i;
        while(k<j) {
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            j--;
            k++;

        }
    }

}
