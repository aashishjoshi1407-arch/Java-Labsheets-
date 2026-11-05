class Employee {
    private String name;
    private int employeeId;

    void setName(String n) { name = n; }
    void setId(int i) { employeeId = i; }
    String getName() { return name; }
    int getId() { return employeeId; }

    void displayEmployee() {
        System.out.println(getName() + " " + getId());
    }
}
interface Programmer {
    void writeCode();
}
interface Researcher {
    void conductResearch();
}
class Developer extends Employee implements Programmer, Researcher {
    public void writeCode() { System.out.println("Coding"); }
    public void conductResearch() { System.out.println("Researching"); }
}
public class Main {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.setName("Aman"); d.setId(101);
        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}