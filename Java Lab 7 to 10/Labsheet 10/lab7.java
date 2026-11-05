import java.io.*;
import java.util.*;
class Main{
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  System.out.print("File: ");
  File f=new File(s.nextLine());
  System.out.println("Exists: "+f.exists());
  System.out.println("Name: "+f.getName());
  System.out.println("Path: "+f.getAbsolutePath());
  System.out.println("Size: "+f.length());
  System.out.println("File: "+f.isFile());
  System.out.println("Directory: "+f.isDirectory());
  System.out.println("Readable: "+f.canRead());
  System.out.println("Writable: "+f.canWrite());
 }
}