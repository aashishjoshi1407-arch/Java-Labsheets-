class Triangle {
    int a=5,b=5,c=5;
    static String type="Scalene/Isosceles/Equilateral";
    void check(){
        boolean valid=a+b>c&&a+c>b&&b+c>a;
        String t=!valid?"Invalid":a==b&&b==c?"Equilateral":a==b||b==c||a==c?"Isosceles":"Scalene";
        System.out.println(type+"\n"+t);
    }
}
class Main {
    public static void main(String[] args){
        new Triangle().check();
    }
}