package classAndobject;

// WAP to create a class Box having length, breadth and height as a instance variable and two constrcutor, one to intialize
// length and breadth and another constructor to intialize length, breadth and height.
// Create two methods which will caculate area and volume of Box.

public class Box {
    private double length;
    private double width;
    private double height;

    Box() {
        length = 0;
        width = 0;
        height = 0;
    }

    Box(double l, double w) {
        length = l;
        width = w;
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void area() {
        System.out.println("Area  of Box : " + (length * width));
    }

    void volume() {
        System.out.println("Volume of Box : " + (length * width * height));
    }

    static void main() {
        Box b = new Box();
        b.area();
        b.volume();

        System.out.println("-----------------");
        Box b2 = new Box(10, 12);
        b2.area();
        b2.volume();

        System.out.println("-----------------");
        Box b3 = new Box(10, 12, 8);
        b3.area();
        b3.volume();
    }

}
