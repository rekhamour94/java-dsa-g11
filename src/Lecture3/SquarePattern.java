package Lecture3;

public class SquarePattern {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;

        // outer loop to handle rows
        for (i = 1; i <= n; i++) {

            // inner loop to handle columns
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
    public static void main(String[] vargs) {
        int n = 5;
        printPattern(n);
    }
}
