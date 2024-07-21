package Lecture5;

public class HCF {
    public static void main(String args[])
    {
        int dividend = 64;
          int devisor = 18;////printing 0 and 1
        if(dividend<devisor) {
            dividend =  devisor;
        }
        else{
            dividend =  dividend;
        }

        while(dividend%devisor!=0)//loop starts from 2 because 0 and 1 are already printed
        {
           int rem =  dividend%devisor;
            dividend= devisor;
            devisor =  rem;
        }
        System.out.print(devisor);

    }
}
