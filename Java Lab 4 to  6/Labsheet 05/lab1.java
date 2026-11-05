class Student {
    private String name;
    private int rollNo;
    private double marks;

    void setName(String n) { name = n; }
    void setRollNo(int r) { rollNo = r; }
    void setMarks(double m) { marks = m; }

    String getName() { return name; }
    int getRollNo() { return rollNo; }
    double getMarks() { return marks; }

    void displayDetails() {
        System.out.println(getName());
        System.out.println(getRollNo());
        System.out.println(getMarks());
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aman");
        s.setRollNo(1);
        s.setMarks(85.5);
        s.displayDetails();
    }
}