class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    void setId(int id) { employeeId = id; }
    void setName(String n) { employeeName = n; }

    void setSalary(double s) {
        if (s >= 0 && s <= 1000000) salary = s;
        else System.out.println("Invalid salary");
    }

    int getId() { return employeeId; }
    String getName() { return employeeName; }
    double getSalary() { return salary; }

    void display() {
        System.out.println(getId() + " " + getName() + " " + getSalary());
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(1);
        e.setName("Aman");
        e.setSalary(50000);
        e.display();
        e.setSalary(2000000);
    }
}