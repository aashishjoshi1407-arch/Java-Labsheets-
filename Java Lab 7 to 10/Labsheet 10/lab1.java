import java.io.*;
class Main{
 public static void main(String[] args)throws Exception{
  FileWriter f=new FileWriter("student.txt");
  f.write("Name: Aman\nRoll: 101\nCourse: BCA\nSemester: 3");
  f.close();
  System.out.println("File created successfully");
 }
}