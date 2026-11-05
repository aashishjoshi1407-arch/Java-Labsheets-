class Animal {
    void eat() { System.out.println("Eating"); }
    void sleep() { System.out.println("Sleeping"); }
}
class Dog extends Animal {
    void bark() { System.out.println("Barking"); }
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.bark();
    }
}