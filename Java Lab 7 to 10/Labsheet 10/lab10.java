import java.io.*;
import java.util.*;
class Main{
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  try{
   System.out.print("ID Name Department Salary: ");
   String id=s.next(),n=s.next(),d=s.next();
   double sal=s.nextDouble();
   FileWriter f=new FileWriter("employees.txt",true);
   f.write(id+" "+n+" "+d+" "+sal+"\n");
   f.close();
   System.out.print("Search ID: ");
   String key=s.next(),x;boolean found=false;
   BufferedReader b=new BufferedReader(new FileReader("employees.txt"));
   while((x=b.readLine())!=null)
    if(x.split(" ")[0].equals(key)){
     System.out.println(x);found=true;
    }
   b.close();
   if(!found)System.out.println("Employee record not found.");
  }catch(FileNotFoundException e){System.out.println("File not found");
  }catch(IOException e){System.out.println(e);}
 }
}