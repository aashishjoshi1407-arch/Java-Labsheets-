class Shape {
    void calculateArea() {}
}
class Circle extends Shape {
    @Override
    void calculateArea() {
        System.out.println(3.14 * 5 * 5);
    }
}
class Rectangle extends Shape {
    @Override
    void calculateArea() {
        System.out.println(5 * 4);
    }
}
public class Main {
    public static void main(String[] args) {
        new Circle().calculateArea();
        new Rectangle().calculateArea();
    }
}