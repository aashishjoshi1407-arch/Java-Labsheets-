import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double c = new Scanner(System.in).nextDouble();
        double f = (double)(c*9/5)+32;
        System.out.println("Fahrenheit: "+f);
    }
}