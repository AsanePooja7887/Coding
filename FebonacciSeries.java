package practice;

import java.util.Scanner;

public class FebonacciSeries
{
    public static int fibonacciNumber(int n) {
        if (n <= 0) return -1; // Handle invalid input case
        if (n == 1 || n == 2) return 1; // Base cases: F(1) = 1, F(2) = 1

        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b; // Return the Nth Fibonacci number
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciNumber(n)); // Print the Nth Fibonacci number
        sc.close();
    }
}
