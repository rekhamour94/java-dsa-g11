package Lecture9;

public class TrappingWater {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,0,3,2,5};
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int totalwater = 0;
        leftMax[0] =  arr[0];
        rightMax[n-1] =  arr[n-1];
        for(int i = 1;i<n;i++) {
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
        for(int j = n-2;j>=0;j--){
            rightMax[j] = Math.max(rightMax[j+1],arr[j]);
        }
        for(int k = 0;k<n;k++) {
            int minValue = Math.min(leftMax[k],rightMax[k]);
            if(minValue>arr[k]) {
                totalwater+= (minValue- arr[k]);
            }
        }

        System.out.println("total water saved " + totalwater);


    }
}
