import java.util.Scanner;

public class PUGradingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       while (true) {
           System.out.println("press 1 to continue and else to quit");
           String input = sc.nextLine();

           if (input.equals("1")) {
               String grade = sc.nextLine();
               double GPA = PUGradingSystem.getGPA(grade);
               System.out.println("GPA : " + GPA);
           } else {
               System.out.println("Program exiting");
               break;
           }
       }

    }

    public static double getGPA(String grade) {
        switch (grade) {
            case "A" -> {
                return 4.0F;
            }
            case "A-" -> {
                return 3.7F;
            }
            case "B+" -> {
                return 3.3F;
            }
            case "B" -> {
                return 3.0F;
            }
            case "B-" -> {
                return 2.7F;
            }
            case "C+" -> {
                return 2.3F;
            }
            case "C" -> {
                return 2.0F;
            }
            case "C-" -> {
                return 1.7F;
            }
            case "D+" -> {
                return 1.3F;
            }
            case "D" -> {
                return 1.0F;
            }
            case "F" -> {
                return 0.0F;
            }
        }

        return 100F;
    }
}

// WAP to create a package NAST and subpackage BE computer. Inside BE Computer, create a class GPA converter.
// From main method inside NAST package take user input and call GPA converter.
