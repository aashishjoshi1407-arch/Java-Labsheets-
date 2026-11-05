class Vehicle {
    void start() { System.out.println("Starting"); }
}
class Car extends Vehicle {
    void drive() { System.out.println("Driving"); }
}
interface Electric {
    void chargeBattery();
}
class ElectricCar extends Car implements Electric {
    public void chargeBattery() {
        System.out.println("Charging");
    }
}
public class Main {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.start(); e.drive(); e.chargeBattery();
    }
}