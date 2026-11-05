import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        if(b != 0) {
            System.out.println(a/b);
            System.out.println(a%b);
        } else
            System.out.println("Cannot divide by zero");
    }
}
