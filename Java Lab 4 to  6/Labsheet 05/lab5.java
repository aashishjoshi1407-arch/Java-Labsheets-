class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println(name + " " + age);
    }
}
class Student extends Person {
    int rollNo;
    String course;

    void displayStudent() {
        displayPerson();
        System.out.println(rollNo + " " + course);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aman";
        s.age = 20;
        s.rollNo = 1;
        s.course = "BCA";
        s.displayStudent();
    }
}