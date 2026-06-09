package mypac.mysubpac;

public class Test {
    private long id = 1;
    protected double gpa = 3.3;
    public String name = "Manju";

    String address = "Punarbash";

    public long getId() {
        return id;
    }

    static void main(String[] args) {
        Test t = new Test();

        // private
        System.out.println(t.id);

        // protected
        System.out.println(t.gpa);

        // public
        System.out.println(t.name);

        // default
        System.out.println(t.address);

        System.out.println(t.getId());
    }
}
