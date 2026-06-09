import java.util.Scanner;

class SumOfTwoNumbers {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println("Sum : " + ( a + b));
	}
}