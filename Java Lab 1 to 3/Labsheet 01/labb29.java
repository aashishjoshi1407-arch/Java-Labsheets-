import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double h = new Scanner(System.in).nextDouble();
        if(h<=0) System.out.println("Invalid height");
        else if(h<150) System.out.println("Short");
        else if(h<=170) System.out.println("Average");
        else System.out.println("Tall");
    }
 
}
