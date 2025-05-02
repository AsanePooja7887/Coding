package practice;

import java.util.Scanner;

public class ArmstrongNo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");

        int n = sc.nextInt();
     //   int n = 153;
        int rem =0 ;
        int sum = 0 ;
        int i = n;
        while(i != 0 )
        {
            rem = i % 10 ;
            sum = sum + (rem * rem * rem );
            i = i / 10;
        }
        if( n == sum)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is  not Armsrong");

        }
    }
}
