package polymorphism;

public class Heater extends AC {
    @Override
    void on() {
        System.out.println("Heater on");
    }

    @Override
    void off() {
        System.out.println("Heater off");
    }
}
