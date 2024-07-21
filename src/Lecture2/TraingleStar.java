package Lecture2;

public class TraingleStar {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        // outer loop to handle rows
        for (i = 1; i < n; i++) { //0-5
            // inner loop to print spaces.
            for (j = 1; j < n-i; j++) {//6-0 6 //2,1
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            // printing new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }


    //5space
    //1
    //4space 2star
    //3 space//s star

    //5
    //1-4 5
    }
