class Employee {
    String name; double salary;
    static String organization="TCS";
    Employee(String n,double s){name=n;salary=s;}
    void compare(Employee e){
        double d=salary-e.salary;
        System.out.println(organization+" "+(d==0?"Equal Salary":d>0?name+" earns more":e.name+" earns more"));
    }
}
class Main {
    public static void main(String[] args){
        Employee a=new Employee("Aman",30000);
        Employee b=new Employee("Rahul",25000);
        a.compare(b);
    }
}