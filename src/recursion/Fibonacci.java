package recursion;

import java.util.Scanner;

public class Fibonacci {


    public static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int fib = fibonacci(number);
        System.out.printf("the %d term of the fibonacci series is %d", number,fib);
    }
}
