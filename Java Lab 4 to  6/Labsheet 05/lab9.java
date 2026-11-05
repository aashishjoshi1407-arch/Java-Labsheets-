class Vehicle {
    void start() { System.out.println("Starting"); }
    void stop() { System.out.println("Stopping"); }
}
class Car extends Vehicle {
    void drive() { System.out.println("Driving"); }
}
class ElectricCar extends Car {
    void chargeBattery() { System.out.println("Battery charging"); }
}
public class Main {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.start();
        e.drive();
        e.chargeBattery();
        e.stop();
    }
}