public class JumpingDemo {

    static String newVar = "Hello";
    String var = "without static keyword String";

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i += 3) {
            if (i >= 50) break;

            System.out.println(i);
        }

        // With static keyword
        String message = JumpingDemo.greeting();
        System.out.println(message);
        System.out.println(newVar);

        // without static keyword
        JumpingDemo jd = new JumpingDemo();
        System.out.println(jd.var);
        System.out.println(jd.greeting2());
    }

    public static String greeting() {
        return "Welcome to 3rd Lab";
    }
    
    public String greeting2() {
        return "Welcome from without static";
    }
}
