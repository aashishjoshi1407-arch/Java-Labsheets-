import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if(n%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}