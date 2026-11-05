import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        char c = new Scanner(System.in).next().charAt(0);
        if(c>='0' && c<='9') System.out.println("Digit");
        else if(c>='A' && c<='Z') System.out.println("Uppercase");
        else if(c>='a' && c<='z') System.out.println("Lowercase");
        else System.out.println("Special character");
    }
}