package Lecture9;

public class RotateArray_demo2 {
    public static void main(String[] args) {
        rotateArray();

    }

    private static void rotateArray() {
        int[] arr=  new int[]{1,2,5,7,9,6};
        int  rotateNo = 2;
        int n  = arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,rotateNo-1);
        reverse(arr,rotateNo,n-1);
        for(int i = 0;i<arr.length;i++){
            System.out.println("array after rotation  " +arr[i] );
        }
    }

    public  static  void reverse(int[] arr,int i, int j){
        int l = i;
        int k = j;
        while(l<k) {
            int temp = arr[l];
            arr[l] = arr[k];
            arr[k] = temp;
            l++;
            k--;
        }
    }
}
