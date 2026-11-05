import java.util.*;
class Test{
 static <T> void display(ArrayList<T> l){
  for(T x:l) System.out.println(x);
 }
 public static void main(String[] a){
  ArrayList<Integer> n=new ArrayList<>();
  n.add(10); n.add(20); n.add(30);
  ArrayList<String> s=new ArrayList<>();
  s.add("Aman Singh"); s.add("Ravi");
  display(n); display(s);
 }
}