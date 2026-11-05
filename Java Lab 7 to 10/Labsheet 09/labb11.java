import java.util.*;
class Main{
 public static void main(String[] args){
  TreeSet<Integer> s=new TreeSet<>(Arrays.asList(5,2,8,2,10,6));
  System.out.println(s);
  System.out.println(s.first());
  System.out.println(s.last());
  System.out.println(s.higher(5));
  System.out.println(s.lower(5));
 }
}