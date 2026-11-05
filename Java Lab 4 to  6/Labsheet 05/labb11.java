class Person {
    String name;
    void displayName() { System.out.println(name); }
}
class Student extends Person {
    String course;
    void study() { System.out.println(course); }
}
class Teacher extends Person {
    String subject;
    void teach() { System.out.println(subject); }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aman"; s.course = "BCA";
        s.displayName(); s.study();

        Teacher t = new Teacher();
        t.name = "Raj"; t.subject = "Java";
        t.displayName(); t.teach();
    }
}