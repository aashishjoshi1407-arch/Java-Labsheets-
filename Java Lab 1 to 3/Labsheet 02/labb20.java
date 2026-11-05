import java.util.*;
class Main{
public static void main(String[]z){
Scanner s=new Scanner(System.in);
String p;
do{
System.out.print("Password: ");
p=s.next();
}while(!p.equals("1234"));
System.out.println("Correct");
}}