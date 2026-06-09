package polymorphism;

import java.util.Scanner;

public class Remote {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature : ");
        int temp = in.nextInt();
        in.close();

        AC ac = new AC();
        if (temp > 25) {
            ac = new Cooler();
        }

        if (temp < 18) {
            ac = new Heater();
        }

        ac.on();
    }
}
