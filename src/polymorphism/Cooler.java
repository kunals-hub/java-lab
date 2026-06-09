package polymorphism;

public class Cooler extends AC{
    @Override
    void on() {
        System.out.println("Cooler on");
    }

    @Override
    void off() {
        System.out.println("Cooler off");
    }
}
