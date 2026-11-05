import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cp=sc.nextDouble(), sp=sc.nextDouble();
        if(sp>cp) System.out.println("Profit: "+(sp-cp));
        else if(cp>sp) System.out.println("Loss: "+(cp-sp));
        else System.out.println("No profit no loss");
    }
}