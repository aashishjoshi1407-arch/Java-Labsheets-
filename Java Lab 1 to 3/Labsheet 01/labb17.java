import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int t=n, rev=0;
        while(t>0) {
            rev=rev*10+t%10;
            t=t/10;
        }
        if(n>=0 && n==rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}