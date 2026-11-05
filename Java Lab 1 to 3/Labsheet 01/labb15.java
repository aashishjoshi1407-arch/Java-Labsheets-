import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int a=n/100, b=n/10%10, c=n%10;
        int sum=a*a*a+b*b*b+c*c*c;
        if(n>=100 && n<=999 && sum==n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}