package inheritance.multilevel;

public class RacingCar extends Car {
    void minSpeed(){
        System.out.println("Min speed 120 km/hrs");
    }

    static void main(String[] args) {
        RacingCar rc = new RacingCar();
        rc.on();
        rc.run();
        rc.minSpeed();
    }
}
