import java.io.*;
import java.util.*;
class Main{
 public static void main(String[] args)throws Exception{
  Scanner s=new Scanner(System.in);
  System.out.print("Word: ");String w=s.next();
  Scanner f=new Scanner(new File("notes.txt"));
  int n=0;
  while(f.hasNext())if(f.next().replaceAll("^[^\\w]+|[^\\w]+$","").equalsIgnoreCase(w))n++;
  f.close();
  System.out.println(n>0?"Found "+n+" times":"Not found");
 }
}