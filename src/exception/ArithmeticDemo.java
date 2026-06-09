package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticDemo {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
