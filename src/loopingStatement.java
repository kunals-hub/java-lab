// a. for loop
// b. while
// c. do while
// d. for each(enhanced for)

import java.util.Scanner;

public class loopingStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---for loop----");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("---while loop---");
        int n2 = input.nextInt();

        while (n2 > 0) {
            if (n2 % 2 != 0) {
                System.out.println(n2);
            }
            n2 -= 2;
        }

        System.out.println("---do while---");
        int n3 = input.nextInt();

        do {
            System.out.println(n3);
            n3--;
        } while (n3 > 20);

        System.out.println("---for each----");
        int nums[] = {23, 45, 22, 78, 99};

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        input.close();
    }
}
