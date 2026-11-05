import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble(), b=sc.nextDouble();
        char op=sc.next().charAt(0);
        if(op=='+') System.out.println(a+b);
        else if(op=='-') System.out.println(a-b);
        else if(op=='*') System.out.println(a*b);
        else if(op=='/') {
            if(b!=0) System.out.println(a/b);
            else System.out.println("Cannot divide by zero");
        }
        else System.out.println("Invalid operator");
    }
}