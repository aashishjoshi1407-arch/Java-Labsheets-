import java.io.*;
import java.util.*;
class Main{
 public static void main(String[] args)throws Exception{
  Scanner s=new Scanner(System.in);
  FileWriter f=new FileWriter("student_records.txt");
  for(int i=1;i<=5;i++){
   System.out.println("Student "+i+" (Roll Name Course Marks):");
   f.write(s.nextInt()+" "+s.next()+" "+s.next()+" "+s.nextInt()+"\n");
  }
  f.close();
  BufferedReader b=new BufferedReader(new FileReader("student_records.txt"));
  String x;
  while((x=b.readLine())!=null)System.out.println(x);
  b.close();
 }
}