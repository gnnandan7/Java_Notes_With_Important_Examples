package _04_Functions._4_recursion;

import java.util.Scanner;

public class _1_factorialEx1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int result = factorial(num);
        System.out.println("The _Assignment_Series.Live_Test.factorial of number "+num+" is: " + result);
    }
    static int factorial(int n)
    {
        if(n==0)
        {
            //recursion happening here
            return 1;
        }
        else
        {
            //recursion happening here
            return(n * factorial(n-1));
        }
    }
}
