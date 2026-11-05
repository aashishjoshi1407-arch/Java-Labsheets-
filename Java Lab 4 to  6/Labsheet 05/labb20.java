class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    void setId(int i) { employeeId = i; }
    void setName(String n) { employeeName = n; }
    void setSalary(double s) { salary = s; }

    int getId() { return employeeId; }
    String getName() { return employeeName; }
    double getSalary() { return salary; }

    void displayDetails() {
        System.out.println(getId() + " " + getName());
    }
    double calculateSalary() { return salary; }
}
interface Researcher {
    void conductResearch();
}
class Teacher extends Employee implements Researcher {
    String subject;

    void teach() { System.out.println("Teaching " + subject); }

    public void conductResearch() {
        System.out.println("Researching");
    }

    @Override
    double calculateSalary() { return super.calculateSalary() + 5000; }
}
class VisitingTeacher extends Teacher {
    int hoursWorked;

    @Override
    double calculateSalary() { return hoursWorked * 500; }
}
class Admin extends Employee {
    String department;

    void manageDepartment() {
        System.out.println("Managing " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setId(1); t.setName("Aman"); t.setSalary(20000);
        t.subject = "Java";
        t.displayDetails(); t.teach(); t.conductResearch();
        System.out.println(t.calculateSalary());

        VisitingTeacher v = new VisitingTeacher();
        v.setId(2); v.setName("Raj");
        v.hoursWorked = 10;
        v.displayDetails();
        System.out.println(v.calculateSalary());

        Admin a = new Admin();
        a.setId(3); a.setName("Ravi"); a.setSalary(30000);
        a.department = "IT";
        a.displayDetails(); a.manageDepartment();
        System.out.println(a.calculateSalary());
    }
}