package Lecture4;

public class RightTriangle
{
    public static void main(String args[])
    {
//i for rows and j for columns
//row denotes the number of rows you want to print
        int i, j, row=4;
//outer loop for rows
        for(i=1; i<row; i++)
        {
//inner loop for columns
            for(j=1; j<=i; j++)
            {
//prints stars
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
