class Employee {
    void calculateSalary() { System.out.println(20000); }
}
class Manager extends Employee {
    @Override
    void calculateSalary() { System.out.println(20000 + 5000); }
}
public class Main {
    public static void main(String[] args) {
        new Employee().calculateSalary();
        new Manager().calculateSalary();
    }
}