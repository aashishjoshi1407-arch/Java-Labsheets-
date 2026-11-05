import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        char op=sc.next().charAt(0);
        if(op=='&') System.out.println(a!=0 && b!=0);
        else if(op=='|') System.out.println(a!=0 || b!=0);
        else if(op=='!') System.out.println(!(a!=0));
        else System.out.println("Invalid operator");
    }
}