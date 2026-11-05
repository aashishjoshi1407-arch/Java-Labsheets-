class Employee {
    String name; int id;
    void displayEmployee() {
        System.out.println(name + " " + id);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    void writeCode() { System.out.println(programmingLanguage); }
}
class Manager extends Employee {
    String department;
    void conductMeeting() { System.out.println(department); }
}
public class Main {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Aman"; d.id = 1;
        d.programmingLanguage = "Java";
        d.displayEmployee(); d.writeCode();

        Manager m = new Manager();
        m.name = "Raj"; m.id = 2;
        m.department = "IT";
        m.displayEmployee(); m.conductMeeting();
    }
}