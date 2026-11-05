import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat(), b=sc.nextFloat(), c=sc.nextFloat();
        float total=a+b+c;
        System.out.println("Total: "+total);
        System.out.println("Percentage: "+total/3+"%");
        if(a>=40 && b>=40 && c>=40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}