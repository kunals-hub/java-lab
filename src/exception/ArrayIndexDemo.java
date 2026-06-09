package exception;

public class ArrayIndexDemo {

    public static void main() {
        String[] names = {
                "Ram",
                "Shyam",
                "Batman",
                "Spiderman"
        };

        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
