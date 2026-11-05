import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op=sc.next().charAt(0);
        double a=sc.nextDouble(), b=sc.nextDouble();
        if(op=='+') System.out.println(a+b);
        else if(op=='-') System.out.println(a-b);
        else if(op=='*') System.out.println(a*b);
        else if(op=='/' && b!=0) System.out.println(a/b);
        else System.out.println("Invalid operation");
    }
}