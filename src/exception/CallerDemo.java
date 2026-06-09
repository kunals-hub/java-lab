package exception;

public class CallerDemo {
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();

        try {
            System.out.println(throwsDemo.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("hi");
        }
    }
}
