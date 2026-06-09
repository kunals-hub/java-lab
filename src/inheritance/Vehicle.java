package inheritance;

// WAP to demonstrate and example of inheritance, encapsulation and polymorphism.

public class Vehicle {
    long id;
    String name;

    void setVehicleInfo() {
        id = 101;
        name = "Bugati";
    }

    void carInfo(){
        System.out.println("Car info : " + id + " : " + name);
    }
}
