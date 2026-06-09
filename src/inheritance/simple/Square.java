package inheritance.simple;

public class Square extends Shape {
    void drawX() {
        System.out.println("X : 20");
    }

    void drawY() {
        System.out.println("Y : 10");
    }

    static void main(String[] args) {
        Square s = new Square();
        s.draw();

        s.drawX();
        s.drawY();

    }
}
