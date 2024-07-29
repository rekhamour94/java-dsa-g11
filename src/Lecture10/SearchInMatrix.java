package Lecture10;

public class SearchInMatrix {
    public static void main(String[] args) {

        //int[][] arr  = new int[r][c];
        int[][] arr = {{1, 3, 5, 4}, {2, 6, 7, 8}, {10, 11, 24, 19}, {12, 15, 19, 20}};
       int  target = 11;
       int r = arr.length;
       int c = arr[0].length;
       int l = 0;
       int j  = c-1;
       while(l<=r-1 && j>=0){
           if(target == arr[l][j]){
               System.out.print(" element found " + "l" + l +" j" + j);
               break;
           }
           else if(target>arr[l][j]) {
               l++;
           }
           else {
               j--;
           }
       }

    }
    }
