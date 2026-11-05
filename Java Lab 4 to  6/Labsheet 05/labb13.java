class Animal {
    void makeSound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Barking"); }
}
class Cat extends Animal {
    @Override
    void makeSound() { System.out.println("Meowing"); }
}
public class Main {
    public static void main(String[] args) {
        new Dog().makeSound();
        new Cat().makeSound();
    }
}