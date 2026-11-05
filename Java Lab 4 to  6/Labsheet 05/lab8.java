class Person {
    String name;
    void displayName() { System.out.println(name); }
}
class Employee extends Person {
    int employeeId;
    void displayEmployee() {
        displayName();
        System.out.println(employeeId);
    }
}
class Manager extends Employee {
    String department;
    void displayManager() {
        displayEmployee();
        System.out.println(department);
    }
}
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Aman";
        m.employeeId = 1;
        m.department = "IT";
        m.displayManager();
    }
}