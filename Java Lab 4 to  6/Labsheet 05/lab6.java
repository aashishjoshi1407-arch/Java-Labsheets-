class Employee {
    private String name;
    private double salary;

    void setName(String n) { name = n; }
    void setSalary(double s) { salary = s; }
    String getName() { return name; }
    double getSalary() { return salary; }
}
class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println(getName() + " " + getSalary() + " " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Aman");
        m.setSalary(50000);
        m.department = "IT";
        m.displayManager();
    }
}