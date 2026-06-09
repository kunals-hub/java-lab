package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleException {
    public static void main() {
        Scanner me = new Scanner(System.in);

        try {
            int a = me.nextInt();
            int b = me.nextInt();
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please enter only valid integer numbers.");
            me.close();
        }
    }
}
