package recursion;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int fac = factorial(number);
        System.out.printf("Factorial of %d is %d", number,fac);
    }
}
