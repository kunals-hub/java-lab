package inheritance;

public class Car extends Vehicle {
    double price = 25415;

    void carPrice() {
        System.out.println("Car Price : " + price);
    }

    static void main() {
        Car car = new Car();
        car.setVehicleInfo();
        car.carInfo();
        car.carPrice();

    }

}
