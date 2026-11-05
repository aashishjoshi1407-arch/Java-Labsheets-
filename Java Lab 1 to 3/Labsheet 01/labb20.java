import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        char g=sc.next().toLowerCase().charAt(0);
        if(g=='m') {
            if(age>=21) System.out.println("Eligible");
            else System.out.println("Not eligible");
        } else if(g=='f') {
            if(age>=18) System.out.println("Eligible");
            else System.out.println("Not eligible");
        } else System.out.println("Invalid gender");
    }
}