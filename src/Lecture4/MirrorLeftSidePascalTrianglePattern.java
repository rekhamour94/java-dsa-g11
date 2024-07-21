package Lecture4;

import java.util.Scanner;
public class MirrorLeftSidePascalTrianglePattern
{  
public static void main(String[] args)  
{  
int i, j, n;
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number of rows you want to print: ");  
n = sc.nextInt();
int row =1;
int star=1;
while (row<=2*n-1) {
    i=1;
    while(i<=star) {
       System.out.print("*");
       i++;
    }
    if(row<n) {
        star++;
    }
    else{
        star--;
    }
    row++;
    System.out.println();


}

}
//for (i= 0; i<= rows-1; i++)
//{
//for (j=0; j<=i; j++)
//{
//System.out.print("*"+ " ");
//}
//System.out.println("");
//}
//for (i=rows-1; i>=0; i--)
//{
//for(j=0; j <= i-1;j++)
//{
//System.out.print("*"+ " ");
//}
//System.out.println("");
//}
//}
}  