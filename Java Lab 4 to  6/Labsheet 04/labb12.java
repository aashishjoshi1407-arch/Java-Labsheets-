class StudentMarks {
    int marks1=80,marks2=90,marks3=70;
    static String universityName="ABC University";
    void show(){
        double avg=(marks1+marks2+marks3)/3.0;
        System.out.println(universityName+" Average: "+avg);
    }
}
class Main {
    public static void main(String[] args){
        new StudentMarks().show();
    }
}