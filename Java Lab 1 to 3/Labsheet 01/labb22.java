import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt(), b=sc.nextInt();
        if(l<=0 || b<=0) System.out.println("Invalid dimensions");
        else if(l==b) System.out.println("Square");
        else System.out.println("Rectangle");
    }
}