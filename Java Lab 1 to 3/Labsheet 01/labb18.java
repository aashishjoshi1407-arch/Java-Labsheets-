import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        boolean prime = n>1;
        for(int i=2;i<=n/i;i++)
            if(n%i==0) {
                prime=false;
                break;
            }
        if(prime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}