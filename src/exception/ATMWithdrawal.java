// WAP to handle custom exception, insufficient fund when you withdrawal and amount from an ATM machine, if remaining
// balance is less than 500.

package exception;

import java.util.Scanner;

public class ATMWithdrawal {
    static void main() {
        int balance = 10000;
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();

        while(true) {
            balance--;
            if (balance - val < 500) {
                try {
                    throw new InsufficentFundException("Your balance is insufficient");
                } catch (InsufficentFundException e) {
                    System.out.println(e.getMessage());
                    break;
                }
            } else {
                System.out.println(balance - val);
            }
        }
    }
}

// WAP to show an example of throws and finally keyword