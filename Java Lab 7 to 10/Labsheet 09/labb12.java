import java.util.*;
class Main{
 public static void main(String[] args){
  ArrayList<String> n=new ArrayList<>();
  HashSet<String> id=new HashSet<>();
  n.add("Aman"); id.add("P101");
  n.add("Rahul"); id.add("P102");
  System.out.println(n+" "+id);
  n.remove("Rahul"); id.remove("P102");
  System.out.println(n.contains("Aman"));
  System.out.println(n+" "+id);
 }
}