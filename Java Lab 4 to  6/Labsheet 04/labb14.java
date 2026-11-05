class Person {
    String name="Aman"; int age=20;
    static String country="India";
    void check(){
        boolean eligible=age>=18;
        System.out.println(name+" "+country+" "+(eligible?"Eligible":"Not Eligible"));
    }
}
class Main {
    public static void main(String[] args){
        new Person().check();
    }
}