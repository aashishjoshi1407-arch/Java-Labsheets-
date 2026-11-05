import java.util.*;
class Main{
 public static void main(String[] args){
  LinkedList<String> a=new LinkedList<>();
  a.addFirst("Aman");
  a.addLast("Rahul");
  a.addLast("Ravi");
  System.out.println(a);
  a.removeFirst();
  a.removeLast();
  System.out.println(a);
 }
}