public class VarAndDataTypes {
    public static void main(String[] args) {
        System.out.println("------Byte-----");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        byte b = 125;
        System.out.println(b);

        System.out.println("-----int------");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int var = (int) Math.pow(2, 31);  // Clamped to Integer.MAX_VALUE
        System.out.println(var);

        System.out.println("-----double-----");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        Double db = Math.pow(2,64);
        System.out.println(db);

        System.out.println("-----float----");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println("------short-----");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println("----long----");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
}
