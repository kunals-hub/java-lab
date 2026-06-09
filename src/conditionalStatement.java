// a. if
// b. if...else
// c. if... else if... else...
// d. switch

import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---if---");
        System.out.println("enter your age for marriage : ");
        int num = input.nextInt();

        if (num >= 20) {
            System.out.println("You can legally marry");
        }

        System.out.println("----if...else----");
        System.out.println("enter your age for pension : ");
        int n = input.nextInt();

        if (n > 65) {
            System.out.println("You are eligible for pension");
        } else {
            System.out.println("You aren't eligible");
        }

        System.out.println("---if...else if...else----");
        System.out.println("enter your age for stage of your life : ");
        int n2 = input.nextInt();
        input.nextLine();  // to consume \n from buffer


        if (n2 <= 5) {
            System.out.println("You are of Shinchan age");
        } else if (n2 < 18) {
            System.out.println("You are a teen");
        } else {
            System.out.println("You are an adult");
        }


        System.out.println("----Switch----");
        System.out.println("enter today's day : ");
        String n3 = input.nextLine();
        input.close();

        switch (n3) {
            case "sun":
                System.out.println("it's sunday");
                break;
            case "mon":
                System.out.println("it's monday");
                break;
            case "tue":
                System.out.println("it's tuesday");
                break;
            case "wed":
                System.out.println("it's wednesday");
                break;
            default:
                System.out.println("it's almost weekend");
        }
    }
}
