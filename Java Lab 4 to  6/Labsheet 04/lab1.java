class Student {
    String name; int age;
    static int count;
    Student(String n,int a){name=n;age=a;count++;}
}
class Main {
    public static void main(String[] args){
        String n="Aman"; int a=20;
        Student s=new Student(n,a);
        System.out.println(s.name+" "+s.age+" Count: "+Student.count);
    }
}