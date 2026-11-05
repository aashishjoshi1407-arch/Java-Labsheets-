import java.util.*;
class Test{
 public static void main(String[] a){
  ArrayList<String> l=new ArrayList<>();
  l.add("Aman Singh"); l.add("Ravi");
  l.add("Riya"); l.add("Neha"); l.add("Raj");
  System.out.println(l);
  System.out.println(l.get(0));
  l.set(1,"Sam");
  l.remove("Riya");
  System.out.println(l);
  System.out.println(l.size());
 }
}