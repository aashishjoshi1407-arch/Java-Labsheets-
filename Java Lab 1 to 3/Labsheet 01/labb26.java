import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if(n>=10000 && n<=99999) {
            if(n/10000==n%10) System.out.println("Same");
            else System.out.println("Different");
        } else System.out.println("Enter a five-digit number");
    }
}