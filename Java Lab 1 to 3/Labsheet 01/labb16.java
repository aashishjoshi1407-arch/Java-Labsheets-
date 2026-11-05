import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        double s = new Scanner(System.in).nextDouble();
        double tax;
        if(s<=250000) tax=0;
        else if(s<=500000) tax=s*0.05;
        else if(s<=1000000) tax=s*0.20;
        else tax=s*0.30;
        System.out.println("Tax: "+tax);
    }
}