package Lecture9;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = new int[]{6,0,5,4};
        int n = arr.length;
        int[] leftMultiplication= new int[n];
        int[] rightMultiplication= new int[n];
        leftMultiplication[0] = 1;
        rightMultiplication[n-1] = 1;
        for(int i = 1;i<n;i++){
            leftMultiplication[i] =  leftMultiplication[i-1]*arr[i-1];
        }
        for(int i = n-2;i>=0;i--){
            rightMultiplication[i] =  rightMultiplication[i+1]*arr[i+1];
        }
        for(int i = 0;i<n;i++){
            arr[i]= rightMultiplication[i]*leftMultiplication[i];
        }
        for(int i = 0;i<n;i++){
        System.out.println("elements " + arr[i]);
        }

    }
}
