import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if(n%3==0 && n%5==0)
            System.out.println("Divisible");
        else
            System.out.println("Not divisible");
    }
}