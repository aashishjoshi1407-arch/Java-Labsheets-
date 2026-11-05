import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        char ch = new Scanner(System.in).next().toLowerCase().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("Vowel");
        else if(ch>='a' && ch<='z')
            System.out.println("Consonant");
        else
            System.out.println("Invalid character");
    }
}