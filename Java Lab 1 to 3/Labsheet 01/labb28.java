import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        int count=0;
        do {
            count++;
            n=n/10;
        } while(n!=0);
        System.out.println("Digits: "+count);
    }
}