import java.io.*;
class Main{
 public static void main(String[] args){
  try(BufferedReader b=new BufferedReader(new FileReader("student.txt"))){
   String s;
   while((s=b.readLine())!=null)System.out.println(s);
  }catch(IOException e){System.out.println("File not found");}
 }
}