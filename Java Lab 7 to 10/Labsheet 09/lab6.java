import java.util.*;
class Main{
 public static void main(String[] args){
  ArrayList<String> a=new ArrayList<>(Arrays.asList("Java","Python","C","C++"));
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter course: ");
  System.out.println(a.contains(sc.nextLine())?"Found":"Not Found");
 }
}