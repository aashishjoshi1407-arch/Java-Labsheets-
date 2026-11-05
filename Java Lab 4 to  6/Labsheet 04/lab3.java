class Circle {
    double radius=5;
    static double PI=3.14;
    void calculate(){
        double a=PI*radius*radius,c=2*PI*radius;
        System.out.println("Area: "+a+"\nCircumference: "+c);
    }
}
class Main {
    public static void main(String[] args){
        new Circle().calculate();
    }
}