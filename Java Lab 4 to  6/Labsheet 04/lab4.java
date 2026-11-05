class Employee {
    int empId=101; double salary=25000;
    static String companyName="TCS";
    void show(){
        int id=empId; double s=salary;
        System.out.println(id+" "+s+" "+companyName);
    }
}
class Main {
    public static void main(String[] args){
        new Employee().show();
    }
}