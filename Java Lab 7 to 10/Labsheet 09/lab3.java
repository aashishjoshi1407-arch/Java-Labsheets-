import java.util.*;
class Main{
 public static void main(String[] args){
  ArrayList<String> a=new ArrayList<>(Arrays.asList("Aman","Rahul","Ravi","Rohit"));
  a.set(1,"Karan");
  a.remove(3);
  System.out.println(a);
 }
}