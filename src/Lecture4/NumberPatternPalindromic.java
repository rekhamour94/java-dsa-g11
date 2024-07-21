package Lecture4;

public class NumberPatternPalindromic {
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }

    private static void printPattern(int n) {
        int row =1;
        int space =n-1;
        int star = 1;
        while(row<=n) {
            int i =1;
            while(i<=space) {
                System.out.print("  ");
               i++;
            }
            int val=1;
            int j =1;
            while(j<=star) {
                System.out.print(val + " ");
                if(j<=star/2){
                    val++;
                }
                else {
                    val--;
                }
                j++;
            }
            row++;
            System.out.println();
            space--;
            star+=2;

        }
    }
}
