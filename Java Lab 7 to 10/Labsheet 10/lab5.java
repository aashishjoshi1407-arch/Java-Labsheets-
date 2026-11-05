import java.io.*;
class Main{
 public static void main(String[] args)throws Exception{
  FileReader r=new FileReader("source.txt");
  FileWriter w=new FileWriter("backup.txt");
  int c;
  while((c=r.read())!=-1)w.write(c);
  r.close();w.close();
  System.out.println("File copied successfully");
 }
}