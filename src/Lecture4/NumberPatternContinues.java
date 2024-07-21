package Lecture4;

public class NumberPatternContinues {
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }

    private static void printPattern(int n) {
        int row =1;
        int space =n-1;
        int  counter = 1;
        int val=1;
        while(row<=n) {  //6<=5
            int i =1;
            while(i<=space) { //4
                System.out.print("\t");
                i++;
            }

            int j =1;
            while(j<=counter) { //1
                System.out.print(val + "\t");//1
                val++; //25
                j++;//10
            }
            row++;//6
            System.out.println();
            space--;// -1
            counter+=2;//11

        }
    }
}
