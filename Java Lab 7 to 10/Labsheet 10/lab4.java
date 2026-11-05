import java.io.*;
import java.util.*;
class Main{
 public static void main(String[] args)throws Exception{
  Scanner s=new Scanner(System.in);
  FileWriter f=new FileWriter("students.txt",true);
  System.out.print("Name: ");String n=s.nextLine();
  System.out.print("Roll: ");int r=s.nextInt();
  System.out.print("Marks: ");int m=s.nextInt();
  f.write(n+" "+r+" "+m+"\n");
  f.close();
  System.out.println("Record added");
 }
}