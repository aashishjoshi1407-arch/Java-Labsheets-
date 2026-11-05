class Calculator {
    static int operationsCount;
    void add(double a,double b){double r=a+b;operationsCount++;System.out.println(r);}
    void sub(double a,double b){double r=a-b;operationsCount++;System.out.println(r);}
    void mul(double a,double b){double r=a*b;operationsCount++;System.out.println(r);}
    void div(double a,double b){if(b==0){System.out.println("Cannot divide by zero");return;}double r=a/b;operationsCount++;System.out.println(r);}
}
class Main {
    public static void main(String[] args){
        Calculator c=new Calculator();
        c.add(10,5);c.sub(10,5);c.mul(10,5);c.div(10,5);
        System.out.println("Operations: "+Calculator.operationsCount);
    }
}